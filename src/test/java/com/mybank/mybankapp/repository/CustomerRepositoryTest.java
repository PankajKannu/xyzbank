package com.mybank.mybankapp.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.InvalidDataAccessApiUsageException;

import com.mybank.mybankapp.entity.Customer;

@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;
	
	
	@Test
	@DisplayName("save customer login details")
	@Disabled
	public void save() {
		Customer customer=new Customer();
		customer.setCustomerId("cust102");
		customer.setPassword("pass102");
		customerRepository.save(customer);
	}
	
	@Test()
	@Disabled
	@DisplayName("Get Customer Login Details By wrong Id ")
	public void getCustomerByInvalidId() {
		Assertions.assertThrows(NoSuchElementException.class, ()->customerRepository.findById(null).get());
	}
	
	@Test()
	@Disabled
	@DisplayName("Get Customer Login Details By Id NULL ")
	public void getCustomerByIdNull() {
		Assertions.assertThrows(InvalidDataAccessApiUsageException.class, ()->customerRepository.findById(null).get());
	}
	
	@Test()
	@Disabled
	@DisplayName("Get Customer Login Details By Id")
	public void getCustomerByValidId() {
		Customer customer=customerRepository.findById("cust101").get();
		assertNotNull(customer);
	}
	
}
