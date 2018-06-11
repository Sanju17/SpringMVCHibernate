package com.csangharsha.springmvchibernate.service.impl;

import com.csangharsha.springmvchibernate.dao.CustomerDao;
import com.csangharsha.springmvchibernate.entity.Customer;
import com.csangharsha.springmvchibernate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public List<Customer> getAllCustomers( ) {
		return customerDao.getAllCustomers();
	}

	public void save( Customer customer ) {
		customerDao.save( customer );
	}

	public void update( Customer customer ) {
		customerDao.update( customer );
	}

	public Customer getCustomerById( int id ) {
		return customerDao.getCustomerById( id );
	}

	public void deleteCustomer( int id ) {
		customerDao.deleteCustomer( id );
	}
}
