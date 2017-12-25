package com.tang.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.tang.mybatis.po.User;

public class UserDaoImpl implements UserDao {
     private SqlSessionFactory sqlSessionFactory = null;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<User> findUserByName(String userName) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlsession =sqlSessionFactory.openSession();
		List<User> user =  sqlsession.selectList("test.findUserByName", userName);
		sqlsession.close();
		return user;
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlsession =sqlSessionFactory.openSession();
		sqlsession.insert("test.insertUser",user);
		sqlsession.close();
	}

	@Override
	public User getUserByID(int id) throws Exception {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		User user =  sqlsession.selectOne("test.getUserByID", id);
		return user;
	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		sqlsession.delete("test.deleteUser",id);
	}

	@Override
	public void updateUser(User user) throws Exception {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		sqlsession.update("test.updateUser",user);
	}

}
