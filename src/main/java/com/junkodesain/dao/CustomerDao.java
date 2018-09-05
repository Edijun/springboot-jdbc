package com.junkodesain.dao;

import java.util.List;

import com.junkodesain.model.Customer;

public interface CustomerDao {
	
	int save(Customer customer);
	
	List<Customer> getAll();
	
	int update(Customer customer);
	
	Customer getCustId(String custId);
	
	int delete(String custId);
}
