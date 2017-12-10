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
				Contract contract = UtilFileCSV.readOneLineCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(1);
				
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
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(1);
				long total = 0;
				for (int i =0; i<contracts.size(); i++) {
					long time = cHbase.createTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
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
	void createQuarterTupletimesTest() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(2);
				long total = 0;
				for (int i =0; i<contracts.size()/4; i++) {
					long time = cHbase.createTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
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
	void createHalfTupletimesTest() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(3);
				long total = 0;
				for (int i =0; i<contracts.size()/2; i++) {
					long time = cHbase.createTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
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
	void create3QuartersTupletimesTest() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(4);
				long total = 0;
				for (int i =0; i<(contracts.size()*3/4); i++) {
					long time = cHbase.createTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
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
	void createFullTupletimesTest() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(5);
				long total = 0;
				for (int i =0; i<(contracts.size()); i++) {
					long time = cHbase.createTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
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
	void readTuple10timesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase(1);
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
	void readFullTupletimesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase(5);
				long total = 0;
				for (int i =0; i<92000; i++) {
					long time = cHbase.readTupleTimes(i);
					total += time;
					System.out.println(total);
				}
				cHbase.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	void readQuarterTupletimesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase(2);
				long total = 0;
				for (int i =0; i<23000; i++) {
					long time = cHbase.readTupleTimes(i);
					total += time;
					System.out.println(total);
				}
				cHbase.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	void readHalfTupletimesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase(3);
				long total = 0;
				for (int i =0; i<46000; i++) {
					long time = cHbase.readTupleTimes(i);
					total += time;
					System.out.println(total);
				}
				cHbase.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	void read3QuartersTupletimesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase(4);
				long total = 0;
				for (int i =0; i<69000; i++) {
					long time = cHbase.readTupleTimes(i);
					total += time;
					System.out.println(total);
				}
				cHbase.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	@Test
	void updateQuarterTuplesTimes() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(2);
				long total = 0;
				for (int i =0; i<contracts.size()/4; i++) {
					long time = cHbase.updateTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
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
	void updateHalfTuplesTimes() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(3);
				long total = 0;
				for (int i =0; i<contracts.size()/2; i++) {
					long time = cHbase.updateTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
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
	void update3quarterTuplesTimes() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(4);
				long total = 0;
				for (int i =0; i<contracts.size()*3/4; i++) {
					long time = cHbase.updateTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
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
	void updateFullTuplesTimes() {
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				Crud cHbase = new CrudHbase(5);
				long total = 0;
				for (int i =0; i<contracts.size(); i++) {
					long time = cHbase.updateTupleTimes(i, contracts.get(i));
					total += time;
					System.out.println(time);
					System.out.println(total);
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
	void deleteTuple10timesTest() {
		try {
			try {
				Crud cHbase = new CrudHbase(1);
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
