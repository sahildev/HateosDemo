package com.spring.hateos.entity;

import java.util.Map;

public class Customer {
    
	private String customerId;
    private String customerName;
    private String companyName;
    private Map<String, Order> orders;

    public Customer() {
        super();
    }

    public Customer(final String customerId, final String customerName, final String companyName) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.companyName = companyName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public void setOrders(final Map<String, Order> orders) {
        this.orders = orders;
    }
    
    @Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", companyName=" + companyName
				+ "]";
	}

}