package com.spring.hateos.service;

import java.util.List;

import com.spring.hateos.entity.Customer;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);

}