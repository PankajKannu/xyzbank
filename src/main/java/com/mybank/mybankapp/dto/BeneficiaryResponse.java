package com.mybank.mybankapp.dto;

public class BeneficiaryResponse {
	
	private String customerId;
	private String benificiaryAccountNumber;
	private String ifsc;
	private String shortName;
	private String bankName;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getBenificiaryAccountNumber() {
		return benificiaryAccountNumber;
	}
	public void setBenificiaryAccountNumber(String benificiaryAccountNumber) {
		this.benificiaryAccountNumber = benificiaryAccountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public BeneficiaryResponse() {
		super();
	}
	public BeneficiaryResponse(String customerId, String benificiaryAccountNumber, String ifsc, String shortName,
			String bankName) {
		super();
		this.customerId = customerId;
		this.benificiaryAccountNumber = benificiaryAccountNumber;
		this.ifsc = ifsc;
		this.shortName = shortName;
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "BeneficiaryRequest [customerId=" + customerId + ", benificiaryAccountNumber=" + benificiaryAccountNumber
				+ ", ifsc=" + ifsc + ", shortName=" + shortName + ", bankName=" + bankName + "]";
	}

}
