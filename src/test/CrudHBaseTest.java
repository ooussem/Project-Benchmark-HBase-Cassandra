package test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

import crud.CrudHbase;
import crud.Crud;
import model.Contract;
import util.Config;
import util.UtilFileCSV;

class CrudHBaseTest {
	
	// TODO : write file time automatically in CSV file
	@Test
	void createTuple10timesTest() {
		try {
			try {
				Contract contract = UtilFileCSV.readOneLineCSV(Config.fileName);
				Crud cHbase = new CrudHbase();
				
				for (int i =0; i<10; i++) {
					long time = cHbase.createTupleTimes(i, contract);
					System.out.println(time);
				}
				cHbase.closeConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	void createTupletimesTest() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.fileName);
				Crud cHbase = new CrudHbase();
				long total = 0;
				for (int i =0; i<contracts.size(); i++) {
					long time = cHbase.createTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@Test
	void readTuple10timesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase();
				for (int i =0; i<10; i++) {
					long time = cHbase.readTupleTimes(i);
					System.out.println(time);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	@Test
	void deleteTuple10timesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase();
				for (int i =0; i<10; i++) {
					long time = cHbase.deleteTupleTimes(i);
					System.out.println(time);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
		
	
	

}
