package jobMapReduce;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class HBaseMapper extends TableMapper<Text, IntWritable>{
	
	// We just want to map all tuples where the contract amount is over than > $10000
	private static final byte[] FAMILY = Bytes.toBytes("details");
	private static final byte[] AWARD_AMOUNT = Bytes.toBytes("awardAmount");
	private static final byte[] VENDOR_NAME = Bytes.toBytes("vendorName");
	
	@Override
	protected void map(ImmutableBytesWritable key, Result value, Mapper<ImmutableBytesWritable, Result, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		byte[] vendorName = value.getValue(FAMILY, VENDOR_NAME);
		byte[] awardAmount = value.getValue(FAMILY, AWARD_AMOUNT);
		
		if(vendorName!= null && awardAmount != null) {
			String name = Bytes.toString(vendorName);
			String amount = Bytes.toString(awardAmount);
			amount = amount.replace("$", "");
			int amountInt = Integer.parseInt(amount);
			
			context.write(new Text(name), new IntWritable(amountInt));
		}
		
	}
	
	

}
