package com.mybank.mybankapp.service;

import java.util.List;

import com.mybank.mybankapp.dto.BeneficiaryDTO;
import com.mybank.mybankapp.dto.BeneficiaryRequest;
import com.mybank.mybankapp.dto.BeneficiaryResponse;

public interface BeneficiaryService {
	
	public List<BeneficiaryDTO> getBeneficiary(String customerId);
	public BeneficiaryResponse save(BeneficiaryRequest request,String customerId);

}
