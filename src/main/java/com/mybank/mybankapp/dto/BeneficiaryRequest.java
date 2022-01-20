package com.mybank.mybankapp.dto;

import javax.validation.constraints.NotEmpty;

public class BeneficiaryRequest {
	@NotEmpty(message = "Benificiary AccountNumber is mandatory")
	private String benificiaryAccountNumber;
	@NotEmpty(message = "IFSC is mandatory")
	private String ifsc;
	@NotEmpty(message = "ShortName is mandatory")
	private String shortName;
	@NotEmpty(message = "BANK Name is mandatory")
	private String bankName;
	
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
	public BeneficiaryRequest(String benificiaryAccountNumber, String ifsc, String shortName, String bankName) {
		super();
		this.benificiaryAccountNumber = benificiaryAccountNumber;
		this.ifsc = ifsc;
		this.shortName = shortName;
		this.bankName = bankName;
	}
	
	

}
