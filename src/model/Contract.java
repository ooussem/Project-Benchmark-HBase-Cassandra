package model;

import java.util.LinkedList;
import java.util.List;

public class Contract {
	private	String	purchaseOrderDesc;
	private String	purchaseOrderNumber;
	private String	revisionNumber;
	private String	specificationNumber;
	private String	contractType;
	private String	startDate;
	private String	dateEnd;
	private String	approvalDate;
	private String	departement;
	private String	vendorName;
	private String	vendorId;
	private String	adress1;
	private String	adress2;
	private String	city;
	private String	state;
	private String	zip;
	private String	awardAmount;
	private String	procurementType;
	private String	contractPDF;
	public List<String> fields;
	
	public Contract() {
	}

	public Contract(String purchaseOrderDesc, String purchaseOrderNumber, String revisionNumber,
			String specificationNumber, String contractType, String startDate, String dateEnd, String approvalDate,
			String departement, String vendorName, String vendorId, String adress1, String adress2, String city,
			String state, String zip, String awardAmount, String procurementType, String contractPDF) {
		
		this.purchaseOrderDesc = purchaseOrderDesc;
		this.purchaseOrderNumber = purchaseOrderNumber;
		this.revisionNumber = revisionNumber;
		this.specificationNumber = specificationNumber;
		this.contractType = contractType;
		this.startDate = startDate;
		this.dateEnd = dateEnd;
		this.approvalDate = approvalDate;
		this.departement = departement;
		this.vendorName = vendorName;
		this.vendorId = vendorId;
		this.adress1 = adress1;
		this.adress2 = adress2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.awardAmount = awardAmount;
		this.procurementType = procurementType;
		this.contractPDF = contractPDF;
		addToFields();
	}

	


	private void addToFields() {
		fields = new LinkedList<>();
		fields.add(this.purchaseOrderDesc);
		fields.add(this.purchaseOrderNumber);
		fields.add(this.revisionNumber);
		fields.add(this.specificationNumber);
		fields.add(this.contractType);
		fields.add(this.startDate);
		fields.add(this.dateEnd);
		fields.add(this.approvalDate);
		fields.add(this.departement);
		fields.add(this.vendorName);
		fields.add(this.vendorId);
		fields.add(this.adress1);
		fields.add(this.adress2);
		fields.add(this.city);
		fields.add(this.zip);
		fields.add(this.state);
		fields.add(this.awardAmount);
		fields.add(this.procurementType);
		fields.add(this.contractPDF);
	}

	public String getPurchaseOrderDesc() {
		return purchaseOrderDesc;
	}



	public void setPurchaseOrderDesc(String purchaseOrderDesc) {
		this.purchaseOrderDesc = purchaseOrderDesc;
	}



	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}



	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}



	public String getRevisionNumber() {
		return revisionNumber;
	}



	public void setRevisionNumber(String revisionNumber) {
		this.revisionNumber = revisionNumber;
	}



	public String getSpecificationNumber() {
		return specificationNumber;
	}



	public void setSpecificationNumber(String specificationNumber) {
		this.specificationNumber = specificationNumber;
	}



	public String getContractType() {
		return contractType;
	}



	public void setContractType(String contractType) {
		this.contractType = contractType;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getDateEnd() {
		return dateEnd;
	}



	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}



	public String getApprovalDate() {
		return approvalDate;
	}



	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}



	public String getDepartement() {
		return departement;
	}



	public void setDepartement(String departement) {
		this.departement = departement;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public String getVendorId() {
		return vendorId;
	}



	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}



	public String getAdress1() {
		return adress1;
	}



	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}



	public String getAdress2() {
		return adress2;
	}



	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public String getAwardAmount() {
		return awardAmount;
	}



	public void setAwardAmount(String awardAmount) {
		this.awardAmount = awardAmount;
	}



	public String getProcurementType() {
		return procurementType;
	}



	public void setProcurementType(String procurementType) {
		this.procurementType = procurementType;
	}



	public String getContractPDF() {
		return contractPDF;
	}



	public void setContractPDF(String contractPDF) {
		this.contractPDF = contractPDF;
	}

	@Override
	public String toString() {
		return "Contract [purchaseOrderDesc=" + purchaseOrderDesc + ", purchaseOrderNumber=" + purchaseOrderNumber
				+ ", revisionNumber=" + revisionNumber + ", specificationNumber=" + specificationNumber
				+ ", contractType=" + contractType + ", startDate=" + startDate + ", dateEnd=" + dateEnd
				+ ", approvalDate=" + approvalDate + ", departement=" + departement + ", vendorName=" + vendorName
				+ ", vendorId=" + vendorId + ", adress1=" + adress1 + ", adress2=" + adress2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", awardAmount=" + awardAmount + ", procurementType="
				+ procurementType + ", contractPDF=" + contractPDF + "]";
	}
	
	
	
	
}
