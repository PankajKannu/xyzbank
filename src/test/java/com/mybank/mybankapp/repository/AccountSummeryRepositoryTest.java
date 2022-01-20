package com.mybank.mybankapp.repository;

import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybank.mybankapp.entity.AccountSummery;
import com.mybank.mybankapp.entity.Customer;
@SpringBootTest
public class AccountSummeryRepositoryTest {
	
	@Autowired
	AccountSummeryRepository accountSummeryRepository;
	
	@Test
	@DisplayName("save accountSummery details")
	@Disabled
	public void save() {
		AccountSummery accountSummery=new AccountSummery();
		accountSummery.setAccountNumber("cust001");
		accountSummery.setAccountType("saving");
		accountSummery.setBalance(10000.00);
		accountSummery.setCreationDate(new Date());
		accountSummery.setCustomerName("pankaj");
		accountSummery.setCustomer(new Customer("cust101","pass101"));
		accountSummeryRepository.save(accountSummery);
	}

}
