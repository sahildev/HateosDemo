package com.spring.hateoas.db;

import java.util.HashMap;
import java.util.Map;

import com.spring.hateos.entity.Customer;

@Deprecated
public class DatabaseClass {
	
	private static Map<String,Customer> customer = new HashMap<>();
	
	
	public static Map<String,Customer> getCustomers()
	{
		return customer;
	}
	
	

}
