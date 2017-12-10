package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.Contract;

public class UtilFileCSV {
	
	
	public static List<Contract> readFileCSV(String pathFile) {
		List<Contract> contracts = new ArrayList<>();
		BufferedReader csvFile = null;
		try {
			csvFile = new BufferedReader(new FileReader(new File(pathFile)));
			
			// 1st method
			csvFile.readLine();
			while(csvFile.readLine() != null) {
				String[] field = csvFile.readLine().split(",");
				Contract contract = new Contract(field[0], field[1], field[2], field[3], field[4], field[5], field[6], field[7], field[8], field[9], field[10], field[11], field[12]
						, field[13], field[14], field[15], field[16], field[17], field[18]);
				contracts.add(contract);
			}
			
			// 2nd method
			//contracts = csvFile.lines().skip(1).map(mapToContract).collect(Collectors.toList());			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				csvFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return contracts;
	}
	
	
	/**
	 * Read one random line from csv file
	 * @param file
	 * @return an object Contract
	 */
	public static Contract readOneLineCSV(String pathFile) {
		BufferedReader csvFile = null;
		Contract contract = null;
		try {
			csvFile = new BufferedReader(new FileReader(new File(pathFile)));
			csvFile.readLine();
			String[] field = new String[19];
			field = csvFile.readLine().concat(" ").split(",");
			contract = new Contract(field[0], field[1], field[2], field[3], field[4], field[5], field[6], field[7], field[8], field[9], field[10], field[11], field[12]
					, field[13], field[14], field[15], field[16], field[17], field[18]);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				csvFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return contract;
	}
	
	
	
	private static Function<String, Contract> mapToContract = (line) -> {
		String[] field = new String[19];
		field = line.concat(" ").replace(",,", ", ,").split(",");
//		for (int i =0; i<=field.length; i++) {
//			if(field.length==0) field[i].replace("", " ");
//		}
		
		Contract contract = new Contract(field[0], field[1], field[2], field[3], field[4], field[5], field[6], field[7], field[8], field[9], field[10], field[11], field[12]
				, field[13], field[14], field[15], field[16], field[17], field[18]);
		return contract;
	};
	
	
	public static void writeCSVFile(long time, String header, String fileName) {
		//FileWriter fw = new FileWriter(fileName);
	}
	
	

}
