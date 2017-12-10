package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import crud.CrudHbase;
import crud.ICrud;
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
				ICrud cHbase = new CrudHbase();
				
				for (int i =0; i<10; i++) {
					long time = cHbase.createTupleTimes(i, contract);
					System.out.println(time);
					//UtilFileCSV.writeCSVFile(time, "create", Config.csvFileResult10timesOperations);
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
				ICrud cHbase = new CrudHbase();
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
				ICrud cHbase = new CrudHbase();
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
