package com.csangharsha.springmvchibernate.service;

import com.csangharsha.springmvchibernate.entity.Customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getAllCustomers();

	void save(Customer customer);

	void update( Customer customer);

	Customer getCustomerById(int id);

	void deleteCustomer(int id);

}
