package com.tang.mybatis.mapper;

import com.tang.mybatis.po.Orders;
import com.tang.mybatis.vo.OrdersCustomer;

public interface OrdersCustomerMapper {
   public OrdersCustomer getOrderCustomer(int orderId) throws Exception;
   public Orders getOrderCustomerByResultMap(int orderId) throws Exception;
   public Orders getOrderAndOrderDetail()  throws Exception;
}
