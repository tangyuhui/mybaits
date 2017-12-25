package com.tang.mybatis.mapper;

import java.util.List;

import com.tang.mybatis.po.Orders;

 

public interface OrdersMapper {
	public abstract List<String> getAllOrders();
	
	public abstract List<Orders> getOrdersUserLazyLoading();
}
