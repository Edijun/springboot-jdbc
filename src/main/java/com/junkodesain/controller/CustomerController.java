package com.junkodesain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junkodesain.model.Customer;
import com.junkodesain.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/")
	public int save(@RequestBody Customer customer) {
		int result = customerService.save(customer);
		return result;
	}

	@GetMapping("/")
	public List<Customer> getAll() {
		List<Customer> result = customerService.getAll();
		return result;
	}

	@PutMapping("/")
	public int updateData(@RequestBody Customer customer) {
		int result = customerService.update(customer);
		return result;
	}

	@GetMapping("/{custid}")
	public Customer getCustId(@PathVariable("custid") String custId) {
		Customer result = customerService.getCustId(custId);
		return result;
	}

	@DeleteMapping("/{custid}")
	public int delete(@PathVariable("custid") String custId) {
		int result = customerService.delete(custId);
		return result;
	}	

}
