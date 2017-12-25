package com.tang.mybatis.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.tang.mybatis.po.User;

public class MybatisFirst {
 @Test
	public void findUserByIdTest() {

		String resource = "SqlMapConfig.xml";
		InputStream inputStream = null;
		int id = 1;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		User user =  sqlsession.selectOne("test.getUserByID", id);
		System.out.println(user);
		sqlsession.close();
	}
 @Test
    public void  findUserByName(){

		String resource = "SqlMapConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		String userName= "小明";
		List<User> user =  sqlsession.selectList("test.findUserByName", userName);
		System.out.println(user);
		sqlsession.close();
    }
 
 @Test
  public void  insertUser(){

		String resource = "SqlMapConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		User user = new User();
		user.setAge(10);
		user.setUserName("张鹏");
		user.setSex(0);
		sqlsession.insert("test.insertUser",user);
		System.out.println(user.getId());
		sqlsession.commit();
		sqlsession.close();
 }
 @Test
 public void deleteUser(){
	    String resource = "SqlMapConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		sqlsession.delete("test.deleteUser",17);
		sqlsession.commit();
		sqlsession.close();
 }
 @Test
 public void updateUser(){
	    String resource = "SqlMapConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlsession = sqlSessionFactory.openSession();
		User user=new User();
		user.setId(21);
		user.setUserName("tangyuhui");
		sqlsession.update("test.updateUser",user);
		sqlsession.commit();
		sqlsession.close();
 }
}
