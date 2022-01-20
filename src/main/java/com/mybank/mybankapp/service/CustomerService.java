package com.mybank.mybankapp.service;

import com.mybank.mybankapp.dto.CustomerDTO;

public interface CustomerService {
	
	public CustomerDTO findById(String id);  

}
