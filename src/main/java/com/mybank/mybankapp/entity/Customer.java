package com.mybank.mybankapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private String customerId;
	
	@Column(name="password")
	private String password;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Customer(String customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", password=" + password + "]";
	}
	
	
	
	
}
