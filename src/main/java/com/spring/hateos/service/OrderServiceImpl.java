package com.spring.hateos.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.hateos.entity.Customer;
import com.spring.hateos.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	private HashMap<String, Customer> customerMap;
	private HashMap<String, Order> customerOneOrderMap;
	private HashMap<String, Order> customerTwoOrderMap;
	private HashMap<String, Order> customerThreeOrderMap;

	public OrderServiceImpl() {

		customerMap = new HashMap<>();
		customerOneOrderMap = new HashMap<>();
		customerTwoOrderMap = new HashMap<>();
		customerThreeOrderMap = new HashMap<>();

		customerOneOrderMap.put("001A", new Order("001A", 450.00, 25));
		customerOneOrderMap.put("002A", new Order("002A", 450.00, 15));

		customerTwoOrderMap.put("002B", new Order("002B", 650.00, 25));
		customerTwoOrderMap.put("002B", new Order("002B", 450.00, 25));

		final Customer cust1 = new Customer("1", "cust1", "ABC Company");
		final Customer cust2 = new Customer("2", "cust2", "ABC Company");
		final Customer cust3 = new Customer("3", "cust3", "ABC Company");

		cust1.setOrders(customerOneOrderMap);
		cust2.setOrders(customerTwoOrderMap);
		cust3.setOrders(customerThreeOrderMap);
		customerMap.put("1", cust1);
		customerMap.put("2", cust2);
		customerMap.put("3", cust3);

	}

	@Override
	public List<Order> getAllOrdersForCustomer(final String customerId) {
		return new ArrayList<>(customerMap.get(customerId).getOrders().values());
	}

	@Override
	public Order getOrderByIdForCustomer(final String customerId, final String orderId) {

		final List<Order> orders = (List<Order>) customerMap.get(customerId).getOrders().values();
		Order selectedOrder = null;
		for (final Order order : orders) {
			if (order.getOrderId().equals(orderId)) {
				selectedOrder = order;
			}
		}
		return selectedOrder;

	}

}