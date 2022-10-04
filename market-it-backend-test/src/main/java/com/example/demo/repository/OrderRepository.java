package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;

@Mapper
@Repository
public interface OrderRepository {
	/* 단일 주문조회 */
	public Order selectOrder(@Param("orderId") String orderId);
	
	/* 주문 목록조회 */
	public List<Order> selectOrderList();
	
	/* 주문 접수처리 */
	public void insertOrder(@Param("orderId") String orderId, @Param("orderName") String orderName);
	
	/* 주문 완료처리 */
	public void updateOrder(@Param("orderId") String orderId);
}
