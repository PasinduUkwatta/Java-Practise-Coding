package firstHadoop;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration; 
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text; 
import org.apache.hadoop.mapreduce.Job; 
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer; 
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat; 
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;




public class TopK{
   
	
	
	public static class TopTenMapper extends Mapper<Object, Text, NullWritable, Text> { 
		
		private TreeMap<Float, Text> ToRecordMap = new TreeMap<Float, Text>(); 
		public void map(Object key, Text value, Context context)throws IOException, InterruptedException { 
			String line=value.toString();
			String[] tokens=line.split(", "); 
			float salary=Float.parseFloat(tokens[3]); 
			ToRecordMap.put(salary, new Text(value)); 
			
			if(ToRecordMap.size()>10){ 
				ToRecordMap.remove(ToRecordMap.firstKey()); 
				} 
			} 
		protected void cleanup(Context context) throws IOException, InterruptedException { 
			for (Text t : ToRecordMap.values()) { 
				context.write(NullWritable.get(), t); 
			} 
			} 
		}
			
		
	
		
		public static class TopTenReducer extends Reducer<NullWritable, Text, NullWritable, Text> { 
			private TreeMap<Float, Text> TopRecordMap = new TreeMap<Float, Text>();
			public void reduce(NullWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
				for (Text value : values) {
					String line=value.toString(); 
					if(line.length()>0){
						String[] tokens=line.split(", "); 
						//split the data and fetch salary float 
						float salary=Float.parseFloat(tokens[3]); 
						//insert salary as key and Salary as value
						//tree map sort the records based on salary
						TopRecordMap.put(salary, new Text(String.valueOf(salary))); } } 
				// If we have more than ten records, remove the one with the lowest salary 
				// As this tree map is sorted in ascending order, the user with 
				// the lowest salary is the first key. 
				if(TopRecordMap.size()>10){ 
					TopRecordMap.remove(TopRecordMap.firstKey()); 
					} 
				for (Text t : TopRecordMap.descendingMap().values()) { 
					
					
					// Output our ten records to the file system with a null key
					context.write(NullWritable.get(), t); 
					} 
				
			} }
				
			
		
		


	public static void main(String[] args) throws Exception { 
		
		args = new String[] { "C:\\hadoop-3.3.0\\datafile\\input\\topk.txt",
		"C:\\hadoop-3.3.0\\datafile\\TopK" };
		
		
		Configuration conf = new Configuration(); 
		FileUtils.deleteDirectory(new File(args[1]));

		Job job = Job.getInstance(conf, "top salary"); 
		
		
		job.setJarByClass(TopK.class); 
		job.setMapperClass(TopTenMapper.class); 
		job.setReducerClass(TopTenReducer.class);
		
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(Text.class); 
		job.setOutputKeyClass(NullWritable.class);
		job.setOutputValueClass(Text.class); 
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1])); 
		System.exit(job.waitForCompletion(true) ? 0 : 1); 
		} 

}