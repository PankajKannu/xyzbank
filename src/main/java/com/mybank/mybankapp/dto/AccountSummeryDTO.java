package com.mybank.mybankapp.dto;

import java.util.Date;

public class AccountSummeryDTO {
	
private String accountNumber;
	
	private String customerName;
	
	
	private String accountType;
	
	private Double balance;
	
	private Date creationDate;

	private String customerId;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public AccountSummeryDTO() {
		super();
	}

	public AccountSummeryDTO(String accountNumber, String customerName, String accountType, Double balance,
			Date creationDate, String customerId) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "AccountSummeryDTO [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountType="
				+ accountType + ", balance=" + balance + ", creationDate=" + creationDate + ", customerId=" + customerId
				+ "]";
	}
	
	
}
