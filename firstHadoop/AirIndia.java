package firstHadoop;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AirIndia {
	public static class AirMapper extends Mapper<Object, Text, Text, Text> {

		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
			String line = value.toString();
			String[] cols = line.split(", ");

			String pollutents = cols[8];
			context.write(new Text(pollutents), new Text(value));

		}
	}

	public static class AirReducer extends Reducer<Text, Text, Text, Text> {

		public int max = 0;
		public String place ="";
		public int pollutents =0;

		public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
			max = 0;

			for (Text value : values) {
				String line = value.toString();

				String[] tokens = line.split(",");

				if (!tokens[6].equals("") && Integer.parseInt(tokens[6]) > max) {
					max = Integer.parseInt(tokens[6]);
					place = tokens[3];
					pollutents =Integer.parseInt(tokens[8]);

				}

			}
			context.write(new Text(key), new Text(max + "	"+place+" "+pollutents));
		}

	}

	public static void main(String[] args) throws Exception {

		args = new String[] { "C:\\hadoop-3.3.0\\datafile\\input\\datasetA.xlsx",
				"C:\\hadoop-3.3.0\\datafile\\AirOutput" };

		/* delete the output directory before running the job */
		FileUtils.deleteDirectory(new File(args[1]));

		if (args.length != 2) {
			System.err.println("Please specify the input and output path");
			System.exit(-1);
		}

		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf);
		job.setJobName("AirIndia");
		job.setJarByClass(AirIndia.class);
		job.setMapperClass(AirMapper.class);
		job.setReducerClass(AirReducer.class);
//		job.setInputFormatClass(TextInputFormat.class);
//		job.setOutputFormatClass(TextOutputFormat.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
