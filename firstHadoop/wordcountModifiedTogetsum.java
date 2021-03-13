package firstHadoop;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class wordcountModifiedTogetsum {
	public static class TokenizerMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
		private final static IntWritable one = new IntWritable(1);
		private Text word = new Text();

		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			StringTokenizer itr = new StringTokenizer(value.toString());
			while (itr.hasMoreTokens()) {
				word.set(itr.nextToken());
				context.write(word, one);
			}
		}
	}

   
	public static class IntSumReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
		HashMap<Text, IntWritable> valueSet = new HashMap<Text, IntWritable>();
		private IntWritable result = new IntWritable();

		public void reduce(Text key, Iterable<IntWritable> values, Context context)
				throws IOException, InterruptedException {
			int sum = 0;
			for (IntWritable val : values) {
				sum += val.get();
			}
			result.set(sum);
			valueSet.put(key, result);
			
		}
	
	
	
		protected void cleanup(Context context)
				throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			
			Iterator it = valueSet.entrySet().iterator();
		    while (it.hasNext()) {
		    	
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        context.write(new Text(pair.getKey().toString()), (IntWritable) pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    
		}
	
	}

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		Job job = Job.getInstance(conf, "word count");
		job.setJarByClass(wordcountModifiedTogetsum.class);
		job.setMapperClass(TokenizerMapper.class);
		job.setCombinerClass(IntSumReducer.class);
		job.setReducerClass(IntSumReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		File inputDir = new File("C:\\hadoop-3.3.0\\datafile\\input\\test.txt");
		File[] fileList=inputDir.listFiles();
		if(fileList.length==1) {
		 for (File file : inputDir.listFiles()) {
			    if (file.getName().endsWith((".txt"))) {
			       System.out.println(file.getPath());
			       FileInputFormat.addInputPath(job, new Path(file.getPath()));
			    }
			  }
		}else {
			System.err.println("PLEASE PUT SINGLE TEXT FILE IN INPUT FOLDER");
			System.exit(0);
		}
		File outputDir=new File("C:\\hadoop-3.3.0\\datafile\\input\\SumOutput");
		FileUtils.deleteDirectory(outputDir);
		
		FileOutputFormat.setOutputPath(job, new Path(outputDir.getPath()));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
