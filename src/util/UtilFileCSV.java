package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import model.Contract;

public class UtilFileCSV {
	
	
	
	public static List<Contract> readFileCSV(String pathFile) {
		List<Contract> contracts = new ArrayList<>();
		Iterable<CSVRecord> records = null;
		try {
			Reader in = new FileReader(pathFile);
			records = CSVFormat.RFC4180.withHeader("purchaseOrderDesc", "purchaseOrderNumber", "revisionNumber", "specificationNumber", "contractType", "startDate", "dateEnd", "approvalDate", "departement", "vendorName"
					, "vendorId", "adress1", "adress2", "city", "state", "zip", "awardAmount", "procurementType", "contractPDF").parse(in);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (CSVRecord record : records) {
		    Contract contract = new Contract(record.get("purchaseOrderDesc"), record.get("purchaseOrderNumber"), record.get("revisionNumber"), record.get("specificationNumber"), record.get("contractType"),
		    		record.get("startDate"), record.get("dateEnd"), record.get("approvalDate"), record.get("departement"), record.get("vendorName"), record.get("vendorId"), 
		    		record.get("adress1"), record.get("adress2"), record.get("city"), record.get("state"), record.get("zip"), record.get("awardAmount"), record.get("procurementType"), record.get("contractPDF"));
		    contracts.add(contract);
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
	

	

}
