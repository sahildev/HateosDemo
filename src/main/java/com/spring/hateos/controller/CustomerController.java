package com.spring.hateos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hateos.entity.Customer;
import com.spring.hateos.entity.Order;
import com.spring.hateos.service.CustomerService;
import com.spring.hateos.service.OrderService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private OrderService orderService;

	// Return all customers
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Customer> getAllCustomers() {
		return customerService.allCustomers();
	}

	// Return a particular customer
	@RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable String customerId) {
		return customerService.getCustomerDetail(customerId);
	}

	// Return all orders for a customer
	@RequestMapping(value = "/{customerId}/orders", method = RequestMethod.GET)
	public List<Order> getOrdersForCustomer(@PathVariable final String customerId) {
		final List<Order> orders = orderService.getAllOrdersForCustomer(customerId);
		return orders;
	}

	// Return a particular order for a given customer
	@RequestMapping(value = "/{customerId}/{orderId}", method = RequestMethod.GET)
	public Order getOrderById(@PathVariable final String customerId, @PathVariable final String orderId) {
		return orderService.getOrderByIdForCustomer(customerId, orderId);
	}

}
