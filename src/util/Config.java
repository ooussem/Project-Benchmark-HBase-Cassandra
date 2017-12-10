package util;

import java.util.ArrayList;
import java.util.List;

public final class Config {
	
	public static final  String	fileName 				= "/home/oussema/eclipse_workspace_gda/Chicagro_contracts_hbase/Ressource/part_contracts.csv";
	public static final  String	DB_HBASE_NAME_1 		= "Contracts_1";
	public static final  String	CF_1 					= "details";
	
	public static final String headerCSV10timesOperations       = "create,read,update,delete";
	public static final String csvFileResult10timesOperations   = "/Chicagro_contracts_hbase/Ressource/Result/";
	
	public final  List<String> allColumns 			= new ArrayList<String>();
	public final  String	purchaseOrderDesc 		= "purchaseOrderDesc";
	public final  String	purchaseOrderNumber 	= "purchaseOrderNumber";
	public final  String	revisionNumber 			= "revisionNumber";
	public final  String	specificationNumber 	= "specificationNumber";
	public final  String	contractType 			= "contractType";
	public final  String	startDate 				= "startDate";
	public final  String	dateEnd 				= "dateEnd";
	public final  String	approvalDate 			= "approvalDate";
	public final  String	departement 			= "departement";
	public final  String	vendorName 				= "vendorName";
	public final  String	vendorId 				= "vendorId";
	public final  String	adress1 				= "adress1";
	public final  String	adress2 				= "adress2";
	public final  String	city 					= "city";
	public final  String	state 					= "state";
	public final  String	zip 					= "zip";
	public final  String	awardAmount 			= "awardAmount";
	public final  String	procurementType 		= "procurementType";
	public final  String	contractPDF 			= "contractPDF";
	
	public Config() {
		this.allColumns.add(purchaseOrderDesc);
		this.allColumns.add(purchaseOrderNumber);
		this.allColumns.add(revisionNumber);
		this.allColumns.add(specificationNumber);
		this.allColumns.add(contractType);
		this.allColumns.add(startDate);
		this.allColumns.add(dateEnd);
		this.allColumns.add(approvalDate);
		this.allColumns.add(departement);
		this.allColumns.add(vendorName);
		this.allColumns.add(vendorId);
		this.allColumns.add(adress1);
		this.allColumns.add(adress2);
		this.allColumns.add(city);
		this.allColumns.add(state);
		this.allColumns.add(zip);
		this.allColumns.add(awardAmount);
		this.allColumns.add(procurementType);
		this.allColumns.add(contractPDF);
	}
	
	
	
	

}
