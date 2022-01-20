package com.mybank.mybankapp.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.mybankapp.dto.BeneficiaryDTO;
import com.mybank.mybankapp.dto.BeneficiaryRequest;
import com.mybank.mybankapp.dto.BeneficiaryResponse;
import com.mybank.mybankapp.service.BeneficiaryService;

@RestController
public class BeneficiaryController {

	@Autowired
	BeneficiaryService beneficiaryService;
	
	@GetMapping("/customer/{customerid}/benificiary")
	public ResponseEntity<List<BeneficiaryDTO>> getBeneficiary(@PathParam("customerid") String customerId){
		return ResponseEntity.ok(beneficiaryService.getBeneficiary(customerId));
	}
	
	@PostMapping(value = "/customer/{customerid}/benificiary")
	public ResponseEntity<BeneficiaryResponse> addBeneficiary(@PathVariable("customerid") String customerId,@RequestBody @Valid BeneficiaryRequest beneficiary){
		return ResponseEntity.ok(beneficiaryService.save(beneficiary,customerId));
	}
	
}
