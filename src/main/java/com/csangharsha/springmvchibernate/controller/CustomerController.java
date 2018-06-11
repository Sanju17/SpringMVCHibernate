package com.csangharsha.springmvchibernate.controller;

import com.csangharsha.springmvchibernate.entity.Customer;
import com.csangharsha.springmvchibernate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	CustomerService customerService;

	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView modelAndView = new ModelAndView( "customer/list" );

		List<Customer> customerList = customerService.getAllCustomers();
		modelAndView.addObject( "customers", customerList );

		return modelAndView;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView update( @PathVariable("id") int id) {
		ModelAndView model = new ModelAndView( "customer/update" );
		Customer customer = customerService.getCustomerById( id );
		model.addObject( "customer", customer );
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add( ) {
		ModelAndView model = new ModelAndView( "customer/add" );
		Customer customer = new Customer();
		model.addObject( "customer", customer );
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save( @ModelAttribute("customer") Customer customer ) {
		customerService.save( customer );
		return new ModelAndView( "redirect:/customer/list" );
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("customer") Customer customer) {
		customerService.update( customer );
		return new ModelAndView( "redirect:/customer/list" );
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete( @PathVariable("id") int id ) {
		customerService.deleteCustomer( id );
		return new ModelAndView( "redirect:/customer/list" );
	}
}
