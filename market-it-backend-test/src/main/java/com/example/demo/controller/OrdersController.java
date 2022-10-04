package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@Controller
public class OrdersController {
	
	@Autowired
	OrderService orderService;
	
	/* 단일 주문조회 */
	@RequestMapping(value="/api/orders/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Order> getOrder(@PathVariable String id) {
		Order order = orderService.getOrder(id);
		
		return new ResponseEntity<>(order, HttpStatus.OK);
	}
	
	/* 주문 목록조회 */
	@RequestMapping(value="/api/orders", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Order>> getOrderList() {
		List<Order> orderList = orderService.getOrderList();
		
		return new ResponseEntity<>(orderList, HttpStatus.OK);
	}
	
	/* 주문 접수처리 */
	@RequestMapping(value="/api/orders/{id}", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> addOrder(@PathVariable String id, @RequestParam String orderName) {
		orderService.addOrder(id, orderName);
		
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	/* 주문 완료처리 */
	@RequestMapping(value="/api/orders/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<String> modifyOrder(@PathVariable String id) {
		orderService.modifyOrder(id);
		
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
