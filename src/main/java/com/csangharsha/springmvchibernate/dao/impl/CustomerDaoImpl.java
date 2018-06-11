package com.csangharsha.springmvchibernate.dao.impl;

import com.csangharsha.springmvchibernate.dao.CustomerDao;
import com.csangharsha.springmvchibernate.entity.Customer;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession( ) {
		try {
			return sessionFactory.getCurrentSession( );
		}catch ( HibernateException he ) {
			return sessionFactory.openSession();
		}
	}

	public List<Customer> getAllCustomers( ) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> customerList = criteria.list( );
		tx.commit();
		session.close();
		return customerList;
	}

	public void save( Customer customer ) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save( customer );
		tx.commit();
		session.close();
	}

	public void update( Customer customer ) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update( customer );
		tx.commit();
		session.close();
	}

	public Customer getCustomerById( int id ) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = session.get( Customer.class, id );
		tx.commit();
		session.close();
		return customer;
	}

	public void deleteCustomer( int id ) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = session.get( Customer.class, id );
		session.delete( customer );
		tx.commit();
		session.close();
	}
}
