package com.mybank.mybankapp.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.mybankapp.dto.AccountSummeryDTO;
import com.mybank.mybankapp.entity.AccountSummery;
import com.mybank.mybankapp.repository.AccountSummeryRepository;
import com.mybank.mybankapp.repository.CustomerRepository;

@Service
public class AccountSummeryServiceImpl implements AccountSummeryService {

	@Autowired
	AccountSummeryRepository accountSummeryRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Override
	public AccountSummeryDTO getAccountSummury(String customerId) {
		
		try {
			customerRepository.findById(customerId).get();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("Invalid Customer Id !!");
		}
		AccountSummery summery;
		summery=accountSummeryRepository.findByCustomerCustomerId(customerId);
		return convertDtoToEntity(summery);
	}
	
	public AccountSummeryDTO convertDtoToEntity(AccountSummery summery) {
		return new AccountSummeryDTO(summery.getAccountNumber(),summery.getCustomerName(),summery.getAccountType(),summery.getBalance(),summery.getCreationDate(),summery.getCustomer().getCustomerId());
	}

}
