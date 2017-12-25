package com.tang.mybatis.dao;

import java.util.List;

import com.tang.mybatis.po.User;

public interface UserDao {
	public abstract List<User> findUserByName(String userName) throws Exception;
	public abstract void insertUser(User user) throws Exception;
	public abstract User getUserByID(int id) throws Exception;
	public abstract void deleteUser(int id) throws Exception;
	public abstract void updateUser(User user) throws Exception;
}
