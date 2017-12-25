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

import com.tang.mybatis.po.User;
import com.tang.mybatis.vo.UserVo;

public class UserMapperTest {
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
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		try {
			userMapper.deleteUser(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void testInsertUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
	    user.setUserName("tang");
	    user.setAge(20);
		 try {
			userMapper.insertUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void testGetUserByID() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		try {
			User user = userMapper.getUserByID(2);
			User user2 =  userMapper.getUserByID(2);
			System.out.println("测试是否相等================================"+ (user==user2));
			System.out.println("测试是否相等equals"+ (user.equals(user2)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}
	@Test
	public void testFindUser(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserVo uservo = new UserVo();
		User user = new User();
	    user.setUserName("张鹏");
	    user.setAge(10);
	    uservo.setUser(user);
		 try {
			List<User>  uv = userMapper.findUser(uservo);
			System.out.println(uv);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
	}
	@Test
	public void getUserListByID(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List list= new ArrayList<>();
		try {
			List userList = userMapper.getUserListByID(list);
			System.out.println(userList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
	}
	
	
	@Test
	public void findUserGoods(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List list= new ArrayList<>();
		try {
			List userList = userMapper.findUserGoods();
			System.out.println(userList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSession.close();
	}
}
