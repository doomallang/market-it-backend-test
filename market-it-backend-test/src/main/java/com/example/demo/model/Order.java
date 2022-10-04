package com.example.demo.model;

public class Order {
	private int orderIdx;
	private String orderId;
	private String orderName;
	private int status;
	
	public Order(int orderIdx, String orderId, String orderName, int status) {
		this.orderIdx = orderIdx;
		this.orderId = orderId;
		this.orderName = orderName;
		this.status = status;
	}
	
	public int getOrderIdx() {
		return orderIdx;
	}
	
	public void setOrderIdx(int orderIdx) {
		this.orderIdx = orderIdx;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderIdx(String orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderName() {
		return orderName;
	}
	
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
