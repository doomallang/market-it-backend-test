package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	/* 단일 주문조회 */
	@Transactional
	public Order getOrder(String orderId) {
		Order order = orderRepository.selectOrder(orderId);
		
		return order;
	}
	
	/* 주문 목록조회 */
	@Transactional
	public List<Order> getOrderList() {
		List<Order> orderList = orderRepository.selectOrderList();
		
		return orderList;
	}
	
	/* 주문 접수처리 */
	@Transactional
	public void addOrder(String orderId, String orderName) {
		orderRepository.insertOrder(orderId, orderName);
	}
	
	/* 주문 완료처리 */
	@Transactional
	public void modifyOrder(String orderId) {
		orderRepository.updateOrder(orderId);
	}
}
