package crud;

import model.Contract;

public interface ICrud {
	
	long createTupleTimes(int key, Contract contract);
	
	long readTupleTimes(int key);
	
	long updateTupleTimes();
	
	long deleteTupleTimes(int key);
	
}
