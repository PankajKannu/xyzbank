package com.mybank.mybankapp.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybank.mybankapp.entity.Beneficiary;

@SpringBootTest
public class BeneficiaryRepositoryTest {

	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	@Test
	@DisplayName("Get Beneficiary By Valid Customer Id")
	//@Disabled
	public void testGetBeneficiaryByValidCustomerId() {
		List<Beneficiary> beneficiarys=beneficiaryRepository.findByIdCustomerId("cust101");
		assertNotNull(beneficiarys);
		//assertEquals(1,beneficiarys.size());
	}
	
	@Test
	@DisplayName("Get Beneficiary By Invalid Valid Customer Id")
	@Disabled
	public void testGetBeneficiaryByInvalidValidCustomerId() {
		List<Beneficiary> beneficiarys=beneficiaryRepository.findByIdCustomerId("cust");
		assertNotNull(beneficiarys);
		assertEquals(0,beneficiarys.size());
		
	}
	
	
	
}
