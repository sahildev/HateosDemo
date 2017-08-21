package com.spring.hateos.service;

import java.util.List;

import com.spring.hateos.entity.Order;

public interface OrderService {

	List<Order> getAllOrdersForCustomer(String customerId);

	Order getOrderByIdForCustomer(String customerId, String orderId);

}
