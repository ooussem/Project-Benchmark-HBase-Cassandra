package crud;

import java.io.IOException;
import java.util.List;

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


public class CrudHbase extends Crud {
	Configuration hbaseConf = null;
	Connection connection = null;
	Table table = null;
	
	
	public CrudHbase(int c) {
		try {
			hbaseConf = HBaseConfiguration.create();
			connection = ConnectionFactory.createConnection(hbaseConf);
			if(c==1) {
				table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_1));
			} else if (c == 2) {
				table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_QUARTER));
			} else if (c == 3) {
				table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_HALF));
			} else if (c == 4) {
				table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_3_QUARTERS));
			} else if (c == 5) {
				table = connection.getTable(TableName.valueOf(Config.DB_HBASE_NAME_FULL));
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public long createTupleTimes(int key, Contract contract) {
		long start = 0, end = 0;
		try {
			
			Put put = new Put(Bytes.toBytes("" +key));
			for (int i = 0; i<Config.allColumns.size(); i++) {
				put.addColumn(Bytes.toBytes(Config.CF_GLOBAL), Bytes.toBytes(Config.allColumns.get(i)), Bytes.toBytes(contract.fields.get(i)));
			}
			start = System.currentTimeMillis();
			table.put(put);
			end = System.currentTimeMillis();
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return (end-start);
	}
	
	
	
	@Override
	public long createTuplesTimes(List<Contract> contracts) {
		long start = 0, end = 0, total = 0;
		try {

			for (Contract contract : contracts) {
				Put put = null;
				for (int i = 0; i<Config.allColumns.size(); i++) {
					put = new Put(Bytes.toBytes("" +i));
					put.addColumn(Bytes.toBytes(Config.CF_GLOBAL), Bytes.toBytes(Config.allColumns.get(i)), Bytes.toBytes(contract.fields.get(i)));
				}
				start = System.currentTimeMillis();
				table.put(put);
				end = System.currentTimeMillis();
				total += (end-start);
				put = null;
			}
			
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return total;
	}


	@Override
	public long readTupleTimes(int key) {
		long start = 0, end = 0;
		try {
			Get get = new Get(Bytes.toBytes("" +key));
			start = System.currentTimeMillis();
			Result result = table.get(get);
			end = System.currentTimeMillis();
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
	public long updateTupleTimes(int key, Contract contract) {
		long start = 0, end = 0;
		try {
			contract.setAdress2("Paris");
			
			Put put = new Put(Bytes.toBytes("" +key));
			for (int i = 0; i<Config.allColumns.size(); i++) {
				put.addColumn(Bytes.toBytes(Config.CF_GLOBAL), Bytes.toBytes(Config.allColumns.get(i)), Bytes.toBytes(contract.fields.get(i)));
			}
			start = System.currentTimeMillis();
			table.put(put);
			end = System.currentTimeMillis();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return (end-start);
	}
	
	
	@Override
	public void closeConnection() {
		try {
			connection.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
