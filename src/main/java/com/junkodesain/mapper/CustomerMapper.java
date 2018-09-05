package com.junkodesain.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.junkodesain.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		
		customer.setId(rs.getLong("id"));
		customer.setCustId(rs.getString("cust_id"));
		customer.setSalutation(rs.getString("salutation"));
		customer.setFullName(rs.getString("full_name"));
		customer.setMotherName(rs.getString("mother_name"));
		customer.setBirthPlace(rs.getString("birth_place"));
		customer.setBirthDate(rs.getTimestamp("birth_date"));
		customer.setGender(rs.getString("gender"));
		customer.setReligion(rs.getString("religion"));
		customer.setMartialStatus(rs.getString("martial_status"));
		customer.setNumberDependent(rs.getInt("number_dependent"));
		customer.setOccupation(rs.getString("occupation"));
		customer.setSubOccupation(rs.getString("sub_occupation"));
		customer.setCreatedAt(rs.getTimestamp("created_at"));
		customer.setCreatedBy(rs.getLong("created_by"));
		customer.setUpdateAt(rs.getTimestamp("update_at"));
		customer.setUpdateBy(rs.getLong("update_by"));

		return customer;
	}

}
