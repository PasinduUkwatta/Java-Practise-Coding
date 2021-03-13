package firstHadoop;

import java.util.StringTokenizer;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;

import org.apache.hadoop.mapreduce.Mapper;

import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class TotalOfTheValues {

	public static class GlobalNumberAdditionMapper extends Mapper<Object, Text, Text, IntWritable> {

		int sum = 0;

		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

			StringTokenizer itr = new StringTokenizer(value.toString());

			while (itr.hasMoreTokens()) {

				String str = itr.nextToken();

				sum = sum + Integer.parseInt(str);

			}

		}

		public void cleanup(Context context) throws IOException, InterruptedException {

			context.write(new Text("Addition of numbers is"), new IntWritable(sum));

		}

	}

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();

		Job job = Job.getInstance(conf, "Addition of Numbers");

		job.setJarByClass(TotalOfTheValues.class);

		job.setMapperClass(GlobalNumberAdditionMapper.class);

		job.setNumReduceTasks(0);

		job.setOutputKeyClass(Text.class);

		job.setOutputValueClass(IntWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));

		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		FileUtils.deleteDirectory(new File(args[1]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);

	}

}
