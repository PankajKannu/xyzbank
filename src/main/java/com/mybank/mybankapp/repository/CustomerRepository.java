package com.mybank.mybankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybank.mybankapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{}
