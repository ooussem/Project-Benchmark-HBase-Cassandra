
package jobMapReduce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class HBaseReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		Iterator<IntWritable> iterator = values.iterator();
		while(iterator.hasNext()) {
			IntWritable iw = iterator.next(); 
			int var = iw.get();
			if(var > 10000) context.write(key, new IntWritable(var));
		}
	}
	
	
	private static void write (Map<String, List<Integer>> map, String key, Integer value) {
		if(!map.containsKey(key)) {
			map.put(key, new ArrayList<Integer>(value));
		}
		map.get(key).add(value);
	}
	
	
	
	
	
	
	
}