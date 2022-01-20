package com.mybank.mybankapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mybank.mybankapp.entity.Customer;
import com.mybank.mybankapp.repository.CustomerRepository;

@SpringBootTest
public class CustomerServiceImplTest {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@MockBean
	CustomerRepository customerRepository; 

	@Test
	@DisplayName("Get Customer By ID")
	@Disabled
	public void testGetById() {
		Customer customer=new Customer();
		customer.setCustomerId("cust001");
		customer.setPassword("pass001");
		String customerId="cust001";
		Mockito.when(customerRepository.findById(customerId)).thenReturn(Optional.of(customer));
		customerServiceImpl.findById(customerId);
		assertEquals(customerId,customer.getCustomerId());
	}
	
	@Test
	@DisplayName("Get Customer By ID NULL")
	@Disabled
	public void testGetByIdWhenIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->customerServiceImpl.findById(null));
	}
	

}
