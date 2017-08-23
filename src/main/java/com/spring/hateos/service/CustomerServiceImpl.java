package com.spring.hateos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
/*import org.slf4j.Logger;*/
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import com.spring.hateos.entity.Customer;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	Logger logger = org.slf4j.LoggerFactory.getLogger(CustomerServiceImpl.class);
    
    private HashMap<String, Customer> customerMap;

    public CustomerServiceImpl() {
    	
    	logger.warn("Hello World");

        customerMap = new HashMap<>();

        final Customer cust1 = new Customer("1", "cust1", "ABC Company");
        final Customer cust2 = new Customer("2", "cust2", "ABC Company");
        final Customer cust3 = new Customer("3", "cust3", "ABC Company");

        customerMap.put("1", cust1);
        customerMap.put("2", cust2);
        customerMap.put("3", cust3);

    }

    @Override
    public List<Customer> allCustomers() {
    	//Logger.debug("IN ABC");
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerDetail(final String customerId) {
        return customerMap.get(customerId);
    }

}
