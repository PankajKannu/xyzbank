package com.mybank.mybankapp.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.mybankapp.dto.CustomerDTO;
import com.mybank.mybankapp.entity.Customer;
import com.mybank.mybankapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public CustomerDTO findById(String id) {
		if (null == id)
			throw new IllegalArgumentException("customer id is not valid");
		Customer customer;
		try {
			customer = customerRepository.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("Invalid Customer Id !!");
		}
		return convertEntityToDto(customer);
	}

	public CustomerDTO convertEntityToDto(Customer customer) {
		return new CustomerDTO(customer.getCustomerId(), customer.getPassword());
	}

}
