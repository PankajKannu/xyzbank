package com.mybank.mybankapp.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class BeneficiaryId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BeneficiaryId() {
		super();
	}
	@Column(nullable = false, name = "customer_id")
	private String customerId;
	@Column(nullable = false, name = "account_id")
	private String accountNo;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public BeneficiaryId(String customerId, String accountNo) {
		super();
		this.customerId = customerId;
		this.accountNo = accountNo;
	}
	

}
