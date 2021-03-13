package firstHadoop;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DataOrganization {
	public static class EmpMapper extends Mapper<Object, Text, Text, Text> {
		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			String record = value.toString();
			String[] parts = record.split("\t", -3);
			record = "emp   " + record;
			context.write(new Text(parts[0]), new Text(record));
		}
	}

	public static class DeptMapper extends Mapper<Object, Text, Text, Text> {
		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			String record = value.toString();
			String[] parts = record.split("\t", -3);
			record = "dpt   " + record;
			context.write(new Text(parts[2]), new Text(record));
		}
	}

	public static class ReduceJoinReducer extends Reducer<Text, String[], Text, NullWritable> {
		DocumentBuilderFactory dbFactory;
		DocumentBuilder dbuilder;
		Document document;
		Element users;
		String USER_ATTRIBUTES[] = {"name","age","gender","salary"};

		protected void setup() throws ParserConfigurationException {
			dbFactory = DocumentBuilderFactory.newInstance();
			dbuilder = dbFactory.newDocumentBuilder();
			document = dbuilder.newDocument();

			users = document.createElement("users");
			document.appendChild(users);
		}

		protected void cleanup(Context context) throws IOException, InterruptedException {
			// Output top ten records to the reducers with a null key
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			StringWriter writer = new StringWriter();

			DOMSource source = new DOMSource(document);
			Transformer transformer;
			try {
				transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.transform(source, new StreamResult(writer));
				context.write(new Text(writer.getBuffer().toString()), NullWritable.get());
			} catch (TransformerConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
			String name = "";
			double total = 0.0;
			int count = 0;

			// child element
			Element user = document.createElement("user");
			users.appendChild(user);

			System.err.print("reducer called");
			for (Text t : values) {
				String x[] = t.toString().split("  ");
				String parts[] = x[1].split("\t", -3);
				
				if (x[0].equals("dept")) {
					count++;
					total += Float.parseFloat(parts[1]);
				} else if (x[0].equals("emp")) {
					user.setAttribute("uid", parts[0]);
					
					for(int i=1;i<5;i++) {
						Element y = document.createElement(USER_ATTRIBUTES[i]);
						y.appendChild(document.createTextNode(parts[i]));
						user.appendChild(y);
					}
				}
			}

		}
	}

	public static void main(String[] args) throws Exception {

		args = new String[] { "C:\\Users\\Avarjana\\eclipse-workspace\\Lab1\\src\\input.txt",
				"C:\\Users\\Avarjana\\eclipse-workspace\\Lab1\\src\\input2.txt",
				"C:\\Users\\Avarjana\\Desktop\\output" };

		/* delete the output directory before running the job */
		try {
			FileUtils.deleteDirectory(new File(args[2]));
		} catch (Exception e) {

		}
		if (args.length != 3) {
			System.err.println("Please specify the input and output path");
			System.exit(-1);
		}

		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf);
		job.setJobName("Reduce-side join");
		job.setJarByClass(DataOrganization.class);
		job.setReducerClass(ReduceJoinReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);

		MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, EmpMapper.class);
		MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, DeptMapper.class);
		Path outputPath = new Path(args[2]);

		FileOutputFormat.setOutputPath(job, outputPath);
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}