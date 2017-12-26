package test;

import java.util.List;

import org.junit.jupiter.api.Test;

import crud.CrudCassandra;
import model.Contract;
import util.Config;
import util.UtilFileCSV;

class CrudCassandraTest {
	
	// CreateTable
	@Test
	public void createTable() {
		try {
			CrudCassandra crudCassandra = new CrudCassandra();
			crudCassandra.createTable("contract_full");
			crudCassandra.closeConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// Insert
	@Test
	public void insertQuarterData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/4; i++) {
					long time = crudCassandra.createTupleTimes(i, "contract", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void insertHalfData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/2; i++) {
					long time = crudCassandra.createTupleTimes(i, "contract_half", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insert3QuartersData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()*3/4; i++) {
					long time = crudCassandra.createTupleTimes(i, "contract_3_quarters", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertFullData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size(); i++) {
					long time = crudCassandra.createTupleTimes(i, "contract_full", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// Update
	@Test
	public void updateQuarterData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/4; i++) {
					long time = crudCassandra.updateTupleTimes(i, "contract", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateHalfData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/2; i++) {
					long time = crudCassandra.updateTupleTimes(i, "contract_half", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void update3QuartersData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()*3/4; i++) {
					long time = crudCassandra.updateTupleTimes(i, "contract_3_quarters", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void updateFullData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size(); i++) {
					long time = crudCassandra.updateTupleTimes(i, "contract_full", contracts.get(i));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateOneData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
					long time = crudCassandra.updateTupleTimes(5, "contract_full", contracts.get(5));
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	// Read
	@Test
	public void getOneData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				for(int i =0; i<10; i++) {
					long time = crudCassandra.readAllTuplesTimes(i, "contract_full");
					total += time;
//					System.out.println(time);
//					System.out.println(contracts.get(i).getAdress2());
					
				}
				
				System.out.println(total);
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// Read
	@Test
	public void getQuarterData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/4; i++) {
					long time = crudCassandra.readAllTuplesTimes(i, "contract");
					total += time;
//					System.out.println(time);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				System.out.println(total);
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void getHalfData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/2; i++) {
					long time = crudCassandra.readAllTuplesTimes(i, "contract_half");
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void get3QuartersData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()*3/4; i++) {
					long time = crudCassandra.readAllTuplesTimes(i, "contract_3_quarters");
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getFullData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size(); i++) {
					long time = crudCassandra.readAllTuplesTimes(i, "contract_full");
					total += time;
//					System.out.println(time);
					System.out.println(total);
//					System.out.println(contracts.get(i).getAdress2());
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// Delete
	@Test
	public void deleteQuarterData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/4; i++) {
					long time = crudCassandra.deleteTupleTimes(i, "contract");
					total += time;
					System.out.println(total);
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void deleteHalfData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()/2; i++) {
					long time = crudCassandra.deleteTupleTimes(i, "contract_half");
					total += time;
					System.out.println(total);
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void delete3QuartersData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size()*3/4; i++) {
					long time = crudCassandra.deleteTupleTimes(i, "contract_3_quarters");
					total += time;
					System.out.println(total);
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void deleteFullData() {
		long total = 0;
		try {
			try {
				List<Contract> contracts = UtilFileCSV.readFileCSV(Config.FILE_NAME);
				CrudCassandra crudCassandra = new CrudCassandra();
				
				for (int i =0; i<contracts.size(); i++) {
					long time = crudCassandra.deleteTupleTimes(i, "contract_full");
					total += time;
					System.out.println(total);
				}	
				crudCassandra.closeConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
