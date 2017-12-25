package com.tang.mybatis.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.tang.mybatis.po.Orders;
import com.tang.mybatis.po.User;

public class OrdersMapperTest {

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
    public void getAllOrders(){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
		try {
			 List<String> orderList= ordersMapper.getAllOrders();
			System.out.println(orderList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
    }
    
    @Test
    public void getOrdersUserLazyLoading(){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
		try {
			 List<Orders> orderList= ordersMapper.getOrdersUserLazyLoading();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
    }

}
