package com.junkodesain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junkodesain.dao.CustomerDao;
import com.junkodesain.model.Customer;
import com.junkodesain.service.CustomerService;
import com.junkodesain.util.CommonUtils;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public int save(Customer customer) {
		customer.setCustId(CommonUtils.generateUUID());
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}

	@Override
	public int update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public Customer getCustId(String custId) {
		return customerDao.getCustId(custId);
	}

	@Override
	public int delete(String custId) {
		return customerDao.delete(custId);
	}

}
