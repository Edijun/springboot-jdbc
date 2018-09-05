package com.junkodesain.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.junkodesain.dao.CustomerDao;
import com.junkodesain.mapper.CustomerMapper;
import com.junkodesain.model.Customer;


@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Customer customer) {
		
		String sql = "INSERT INTO multifinance.cust("
				+ "cust_id, salutation, full_name, mother_name, birth_place, birth_date, gender, "
				+ "religion, martial_status, number_dependent, occupation, sub_occupation, created_at, "
				+ "created_by, update_at, update_by"
				+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now(), ?, now(), ?);";
		
		int res = jdbcTemplate.update(sql, 
				customer.getCustId(),
				customer.getSalutation(),
				customer.getFullName(),
				customer.getMotherName(),
				customer.getBirthPlace(),
				customer.getBirthDate(),
				customer.getGender(),
				customer.getReligion(),
				customer.getMartialStatus(),
				customer.getNumberDependent(),
				customer.getOccupation(),
				customer.getSubOccupation(),
				customer.getCreatedBy(),
				customer.getUpdateBy()
				);
		
		return res;
	}

	@Override
	public List<Customer> getAll() {
		
		String sql = "SELECT "
				+ "id, cust_id, salutation, full_name, mother_name, birth_place, birth_date, gender, "
				+ "religion, martial_status, number_dependent, occupation, sub_occupation, created_at, "
				+ "created_by, update_at, update_by "
				+ "FROM multifinance.cust;";
		
		List<Customer> customers = jdbcTemplate.query(sql, new CustomerMapper());
		return customers;
	}

	@Override
	public int update(Customer customer) {

		String sql = "UPDATE multifinance.cust SET "
				+ "salutation=?, full_name=?, mother_name=?, birth_place=?,  birth_date=?, gender=?, "
				+ "religion=?, martial_status=?, number_dependent=?, occupation=?, sub_occupation=?, "
				+ "update_at=now(), update_by=? "
				+ "WHERE cust_id=?;";
		
		int res = jdbcTemplate.update(sql, 
				customer.getSalutation(),
				customer.getFullName(),
				customer.getMotherName(),
				customer.getBirthPlace(),
				customer.getBirthDate(),
				customer.getGender(),
				customer.getReligion(),
				customer.getMartialStatus(),
				customer.getNumberDependent(),
				customer.getOccupation(),
				customer.getSubOccupation(),
				customer.getUpdateBy(),
				customer.getCustId()
				);
		
		return res;
	}

	@Override
	public Customer getCustId(String custId) {
		
		String sql = "SELECT "
				+ "id, cust_id, salutation, full_name, mother_name, birth_place, birth_date, "
				+ "gender, religion, martial_status, number_dependent, occupation, sub_occupation, "
				+ "created_at, created_by, update_at, update_by "
				+ "FROM multifinance.cust "
				+ "WHERE cust_id=?;"; 
		
		Customer customer = jdbcTemplate.queryForObject(sql, new Object[] { custId }, new CustomerMapper());
		return customer;
	}

	@Override
	public int delete(String custId) {

		String sql = "DELETE FROM multifinance.cust WHERE cust_id=?;";
		int res = jdbcTemplate.update(sql, new Object[] { custId });
		return res;
	}

}
