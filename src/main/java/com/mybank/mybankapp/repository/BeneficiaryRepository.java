package com.mybank.mybankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybank.mybankapp.entity.Beneficiary;
import com.mybank.mybankapp.entity.BeneficiaryId;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, BeneficiaryId>{
	
	public List<Beneficiary> findByIdCustomerId(String customerId);

}
