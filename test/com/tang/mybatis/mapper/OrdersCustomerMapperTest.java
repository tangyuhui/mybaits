package com.tang.mybatis.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.tang.mybatis.po.Orders;
import com.tang.mybatis.vo.OrdersCustomer;

public class OrdersCustomerMapperTest {

	SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void initialize(){
    	String resource = "SqlMapConfig.xml";
 		InputStream inputStream = null;
 		try {
 			inputStream = Resources.getResourceAsStream(resource);
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
	@Test
	public void getOrderCustomerById(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersCustomerMapper ordersCustomerMapper = sqlSession.getMapper(OrdersCustomerMapper.class);
		try {
			 OrdersCustomer oc= ordersCustomerMapper.getOrderCustomer(1);
			System.out.println(oc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
	}
	
	@Test
	public void getOrderCustomerByResultMap(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersCustomerMapper ordersCustomerMapper = sqlSession.getMapper(OrdersCustomerMapper.class);
		try {
			 Orders order= ordersCustomerMapper.getOrderCustomerByResultMap(1);
			System.out.println(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
	}
	@Test
	public void getOrderAndOrderDetail(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersCustomerMapper ordersCustomerMapper = sqlSession.getMapper(OrdersCustomerMapper.class);
		try {
			 Orders order= ordersCustomerMapper.getOrderAndOrderDetail();
			System.out.println(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
		
	}
}
