package com.spring.hateos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hateos.entity.Customer;
import com.spring.hateos.service.CustomerService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;
 
    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable String customerId) {
        return customerService.getCustomerDetail(customerId);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.allCustomers();
    }
}
