package com.mybank.mybankapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity

public class Beneficiary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	BeneficiaryId id;
	
	
	public BeneficiaryId getId() {
		return id;
	}
	public void setId(BeneficiaryId id) {
		this.id = id;
	}
	@Column(name="ifsc")
	
	
	private String ifsc;
	
	
	@Column(name="shortName")
	private String shortName;
	
	
	@Column(name="bankName")
	private String bankName;
	
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
	
	
	public Beneficiary(BeneficiaryId id, String ifsc, String shortName, String bankName) {
		super();
		this.id = id;
		this.ifsc = ifsc;
		this.shortName = shortName;
		this.bankName = bankName;
	}
	
	
	public Beneficiary() {
		super();
	}
	@Override
	public String toString() {
		return "Beneficiary [id=" + id + ", ifsc=" + ifsc + ", shortName=" + shortName + ", bankName=" + bankName + "]";
	}
	

	
	
}
