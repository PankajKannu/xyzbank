package com.mybank.mybankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybank.mybankapp.entity.AccountSummery;

@Repository
public interface AccountSummeryRepository extends JpaRepository<AccountSummery, String>{
	
	public AccountSummery findByCustomerCustomerId(String customerId);

}
