package com.tang.mybatis.dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.tang.mybatis.po.User;

public class UserDaoImplTest {
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
	public void testFindUserByName() {
	  UserDao userDao = new UserDaoImpl(sqlSessionFactory);
	  try {
		List<User> user = userDao.findUserByName("tang");
		System.out.println(user);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserByID() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

}
