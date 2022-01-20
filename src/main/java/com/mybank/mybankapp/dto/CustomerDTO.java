package com.mybank.mybankapp.dto;

public class CustomerDTO {

	private String customerId;
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

	
	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", password=" + password + "]";
	}

}
