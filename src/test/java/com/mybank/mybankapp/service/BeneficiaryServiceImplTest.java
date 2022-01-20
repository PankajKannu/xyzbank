package com.mybank.mybankapp.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mybank.mybankapp.entity.Beneficiary;
import com.mybank.mybankapp.entity.BeneficiaryId;
import com.mybank.mybankapp.repository.BeneficiaryRepository;

@SpringBootTest
public class BeneficiaryServiceImplTest {

	@Autowired
	BeneficiaryServiceImpl beneficiaryServiceImpl;
	@MockBean
	BeneficiaryRepository beneficiaryRepository;
	
	@Test
	@DisplayName("GET BENEFICIARY BY VALID CUSTOMER ID")
	@Disabled
	public void testGetBeneficiaryByValidCustomerId() {
		Beneficiary beneficiaryDTO=new Beneficiary();
		beneficiaryDTO.setBankName("bankName");
		beneficiaryDTO.setId(new BeneficiaryId("cust101","acco101"));
		beneficiaryDTO.setIfsc("ifsc");
		beneficiaryDTO.setShortName("shortName");
		List<Beneficiary> beneficiaryDTOs=new ArrayList<Beneficiary>();
		beneficiaryDTOs.add(beneficiaryDTO);
		Mockito.when(beneficiaryRepository.findByIdCustomerId("cust101")).thenReturn(beneficiaryDTOs);
		beneficiaryServiceImpl.getBeneficiary("cust101");
		verify(beneficiaryRepository).findByIdCustomerId("cust101");
	}
	
	@Test
	@DisplayName("GET BENEFICIARY BY INVALID CUSTOMER ID")
	//@Disabled
	public void testGetBeneficiaryByInValidCustomerId() {
		assertThrows(NoSuchElementException.class, ()->beneficiaryServiceImpl.getBeneficiary("cust102"));
	}
	
}
