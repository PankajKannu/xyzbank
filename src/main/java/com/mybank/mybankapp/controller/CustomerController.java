package com.mybank.mybankapp.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.mybankapp.dto.AccountSummeryDTO;
import com.mybank.mybankapp.service.AccountSummeryService;

@RestController
public class CustomerController {
	
	@Autowired
	AccountSummeryService accountSummeryService;
	
	@GetMapping("/customer/{customerid}/summery")
	public ResponseEntity<AccountSummeryDTO> getBeneficiary(@PathParam("customerid") String customerId){
		return ResponseEntity.ok(accountSummeryService.getAccountSummury(customerId));
	} 

}
