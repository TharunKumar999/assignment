package service;

import java.util.List;
import java.util.Set;

import demo.model.Order;

public interface OrderService {
	
	
	public Order createOrder(Order order);
	public List<Order> getAllOrder();
}
