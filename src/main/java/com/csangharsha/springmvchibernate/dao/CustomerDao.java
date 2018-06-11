package com.csangharsha.springmvchibernate.dao;

import com.csangharsha.springmvchibernate.entity.Customer;

import java.util.List;

public interface CustomerDao {

	List<Customer> getAllCustomers();

	void save(Customer customer);

	void update( Customer customer);

	Customer getCustomerById(int id);

	void deleteCustomer(int id);

}
