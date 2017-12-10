package util;

import java.util.ArrayList;
import java.util.List;

public final class Config {
	
	// File
	public static final  String	FILE_NAME 				= "/home/oussema/eclipse_workspace_gda/Chicagro_contracts_hbase/Ressource/contracts.csv";
	public static final  String	FILE_NAME_QUARTER 		= "/home/oussema/eclipse_workspace_gda/Chicagro_contracts_hbase/Ressource/contracts_quarter.csv";
	
	// DB name
	public static final  String	DB_HBASE_NAME_1 				= "Contracts_1";
	public static final  String	DB_HBASE_NAME_QUARTER 			= "Contracts_quarter";
	public static final  String	DB_HBASE_NAME_HALF 				= "Contracts_half";
	public static final  String	DB_HBASE_NAME_3_QUARTERS 		= "Contracts_3_quarter";
	public static final  String	DB_HBASE_NAME_FULL		 		= "Contracts_full";
	
	// Column Family
	public static final  String	CF_GLOBAL 						= "details";
	
	public static final String headerCSV10timesOperations       = "create,read,update,delete";
	public static final String csvFileResult10timesOperations   = "/Chicagro_contracts_hbase/Ressource/Result/";
	
	
	
	public final  static List<String> allColumns 			= new ArrayList<String>();
	public final  static String	purchaseOrderDesc 		= "purchaseOrderDesc";
	public final  static String	purchaseOrderNumber 	= "purchaseOrderNumber";
	public final  static String	revisionNumber 			= "revisionNumber";
	public final  static String	specificationNumber 	= "specificationNumber";
	public final  static String	contractType 			= "contractType";
	public final  static String	startDate 				= "startDate";
	public final  static String	dateEnd 				= "dateEnd";
	public final  static String	approvalDate 			= "approvalDate";
	public final  static String	departement 			= "departement";
	public final  static String	vendorName 				= "vendorName";
	public final  static String	vendorId 				= "vendorId";
	public final  static String	adress1 				= "adress1";
	public final  static String	adress2 				= "adress2";
	public final  static String	city 					= "city";
	public final  static String	state 					= "state";
	public final  static String	zip 					= "zip";
	public final  static String	awardAmount 			= "awardAmount";
	public final  static String	procurementType 		= "procurementType";
	public final  static String	contractPDF 			= "contractPDF";
	
	static{
		allColumns.add(purchaseOrderDesc);
		allColumns.add(purchaseOrderNumber);
		allColumns.add(revisionNumber);
		allColumns.add(specificationNumber);
		allColumns.add(contractType);
		allColumns.add(startDate);
		allColumns.add(dateEnd);
		allColumns.add(approvalDate);
		allColumns.add(departement);
		allColumns.add(vendorName);
		allColumns.add(vendorId);
		allColumns.add(adress1);
		allColumns.add(adress2);
		allColumns.add(city);
		allColumns.add(state);
		allColumns.add(zip);
		allColumns.add(awardAmount);
		allColumns.add(procurementType);
		allColumns.add(contractPDF);
	}
	
	
	
	

}
