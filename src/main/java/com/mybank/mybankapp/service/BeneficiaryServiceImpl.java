package com.mybank.mybankapp.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.mybankapp.dto.BeneficiaryDTO;
import com.mybank.mybankapp.dto.BeneficiaryRequest;
import com.mybank.mybankapp.dto.BeneficiaryResponse;
import com.mybank.mybankapp.entity.Beneficiary;
import com.mybank.mybankapp.entity.BeneficiaryId;
import com.mybank.mybankapp.repository.BeneficiaryRepository;
import com.mybank.mybankapp.repository.CustomerRepository;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	@Autowired 
	CustomerRepository customerRepository;
	
	@Override
	public List<BeneficiaryDTO> getBeneficiary(String customerId) {
		if(null==customerId) throw new IllegalArgumentException("Invalid Customer Id");
		try {
		customerRepository.findById(customerId).get();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("Invalid Customer Id !!");
		}
		List<Beneficiary> beneficiarys =beneficiaryRepository.findByIdCustomerId(customerId);
		return convertDtoToEntity(beneficiarys);
		
		
	}

	public List<BeneficiaryDTO> convertDtoToEntity(List<Beneficiary> aDto) {
	    return aDto.stream()
	        .map(dto -> new BeneficiaryDTO(dto.getIfsc(), dto.getShortName(), dto.getBankName(), dto.getId().getAccountNo()))
	        .collect(Collectors.toList());
	  }

	@Override
	public BeneficiaryResponse save(BeneficiaryRequest request,String customerId) {
		if(null==customerId) throw new IllegalArgumentException("Invalid Customer Id");
		try {
		customerRepository.findById(customerId).get();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException("Invalid Customer Id !!");
		}
		Beneficiary beneficiary=new Beneficiary(new BeneficiaryId(customerId,request.getBenificiaryAccountNumber()),request.getIfsc(),request.getShortName(),request.getBankName());
		Beneficiary beneficiaryResponse=beneficiaryRepository.save(beneficiary);
		return new BeneficiaryResponse(beneficiaryResponse.getId().getCustomerId(),beneficiaryResponse.getId().getAccountNo(),beneficiaryResponse.getIfsc(),beneficiaryResponse.getShortName(),beneficiaryResponse.getBankName());
	}
	
}
