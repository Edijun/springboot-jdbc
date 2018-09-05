package com.junkodesain.service;

import java.util.List;

import com.junkodesain.model.Customer;

public interface CustomerService {

	int save(Customer customer);

	List<Customer> getAll();

	int update(Customer customer);

	Customer getCustId(String custId);

	int delete(String custId);

}
