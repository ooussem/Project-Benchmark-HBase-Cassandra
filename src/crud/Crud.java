package crud;

import java.util.List;

import model.Contract;

public abstract class Crud {
	
	
	public long createTupleTimes(int i, Contract c) {
		return 0;
	}
	
	
	
	public long createTuplesTimes(List<Contract> contracts) {
		return 0;
	}
	
	
	
	public long readTupleTimes(int key) {
		return 0;
	}
	
	public long updateTupleTimes(int key, Contract contract) {
		return 0;
	}
	
	public long deleteTupleTimes(int key) {
		return 0;
	}



	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

	
}
