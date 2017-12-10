package crud;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import model.Contract;
import util.Config;


public class CrudHbase implements ICrud {
	
	@Override
	public long createTupleTimes(int key, Contract contract) {
		long start = 0, end = 0;
		try {
			Configuration hbaseConf = HBaseConfiguration.create();
			Connection connection = ConnectionFactory.createConnection(hbaseConf);
			Table table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_1));
			
			util.Config config = new Config();
			Put put = new Put(Bytes.toBytes("" +key));
			for (int i = 0; i<config.allColumns.size(); i++) {
				put.addColumn(Bytes.toBytes(Config.CF_1), Bytes.toBytes(config.allColumns.get(i)), Bytes.toBytes(contract.fields.get(i)));
			}
			start = System.currentTimeMillis();
			table.put(put);
			end = System.currentTimeMillis();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return (end-start);
	}
	
	
	
	@Override
	public long readTupleTimes(int key) {
		long start = 0, end = 0;
		try {
			Configuration hbaseConf = HBaseConfiguration.create();
			Connection connection = ConnectionFactory.createConnection(hbaseConf);
			Table table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_1));
			Get get = new Get(Bytes.toBytes("" +key));
			start = System.currentTimeMillis();
			Result result = table.get(get);
			end = System.currentTimeMillis();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return (end-start);
	}


	
	
	@Override
	public long deleteTupleTimes(int key) {
		long start = 0, end = 0;
		try {
			Configuration hbaseConf = HBaseConfiguration.create();
			Connection connection = ConnectionFactory.createConnection(hbaseConf);
			Table table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_1));
			
			Delete delete = new Delete(Bytes.toBytes("" +key));
			start = System.currentTimeMillis();
			table.delete(delete);
			end = System.currentTimeMillis();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return (end-start);
	}

	
	
	@Override
	public long updateTupleTimes() {
		// TODO Auto-generated method stub
		return 0;
	}



}
