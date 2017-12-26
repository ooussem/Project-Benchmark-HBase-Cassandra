package crud;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import model.Contract;
import util.Config;

public class CrudCassandra extends Crud{
	Cluster cluster = null;
	Session session = null;
	
	public CrudCassandra() {
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("Contracts");
	}

	
	
	public void createTable(String tableName) {
		try {
			StringBuilder query = new StringBuilder("CREATE TABLE "+tableName+" (ID varint PRIMARY KEY, purchaseOrderDesc text");
			for (String column : Config.allColumns.subList(1, Config.allColumns.size())) {
				query.append(", " +column+ " text");
			}
			query.append(");");
			session.execute(query.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public long createTupleTimes (int id, String tableName, Contract c) {
		long total = 0, start = 0, end = 0;
		try {
			StringBuilder query = new StringBuilder("INSERT INTO "+tableName+" (id");
			for (String column : Config.allColumns) {
				query.append(", "+column);
			}
			query.append(") VALUES("+id);
			for(String field : c.fields) {
				query.append(", '"+field.replace("'","°")+"'");
			}
			query.append(");");
			start = System.currentTimeMillis();
			session.execute(query.toString());
			end = System.currentTimeMillis();
			total += (end-start);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	
	public long readAllTuplesTimes(int id, String tableName) {
		long total = 0, start = 0, end = 0;
		try {
			StringBuilder query = new StringBuilder("SELECT * FROM " +tableName+ " WHERE id=" +id+ ";");
			start = System.currentTimeMillis();
			session.execute(query.toString());
			end = System.currentTimeMillis();
			total += (end-start);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	
	public long updateTupleTimes(int id, String tableName, Contract c) {
		long total = 0, start = 0, end = 0;
		c.setAdress2("Paris");
		try {
			StringBuilder query = new StringBuilder("UPDATE "+tableName+" SET purchaseOrderDesc='" +c.getPurchaseOrderDesc().replace("'","°")+ "'");
			
			for(int i = 1; i< c.fields.subList(1, c.fields.size()).size(); i++) {
				query.append(", " +Config.allColumns.get(i)+ "='"+c.fields.get(i).replace("'","°")+ "'");
			}
			
			query.append("WHERE id =" +id+ ";");
			start = System.currentTimeMillis();
			session.execute(query.toString());
			end = System.currentTimeMillis();
			total += (end-start);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	public long deleteTupleTimes(int key, String tableName) {
		long total = 0, start = 0, end = 0;
		try {
			StringBuilder query = new StringBuilder("DELETE FROM " +tableName+ " WHERE id=" +key+ ";");
			start = System.currentTimeMillis();
			session.execute(query.toString());
			end = System.currentTimeMillis();
			total += (end-start);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	@Override
	public void closeConnection() {
		session.close();
		cluster.close();
	}
	
	
	
	
	
}
