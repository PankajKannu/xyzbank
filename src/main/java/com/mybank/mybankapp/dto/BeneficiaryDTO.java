package com.mybank.mybankapp.dto;

public class BeneficiaryDTO {
	
	private String ifsc;
	
	private String shortName;
	
	private String bankName;
	
	private String benificiaryAccountNumber;

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

	public String getBenificiaryAccountNumber() {
		return benificiaryAccountNumber;
	}

	public void setBenificiaryAccountNumber(String benificiaryAccountNumber) {
		this.benificiaryAccountNumber = benificiaryAccountNumber;
	}

	@Override
	public String toString() {
		return "BeneficiaryDTO [ifsc=" + ifsc + ", shortName=" + shortName + ", bankName=" + bankName
				+ ", benificiaryAccountNumber=" + benificiaryAccountNumber + "]";
	}

	public BeneficiaryDTO(String ifsc, String shortName, String bankName, String benificiaryAccountNumber) {
		super();
		this.ifsc = ifsc;
		this.shortName = shortName;
		this.bankName = bankName;
		this.benificiaryAccountNumber = benificiaryAccountNumber;
	}

	public BeneficiaryDTO() {
		super();
	}
	
	

}
