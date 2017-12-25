package com.tang.mybatis.mapper;

import java.util.List;

import com.tang.mybatis.po.User;
import com.tang.mybatis.vo.UserVo;

public interface UserMapper {
	public abstract List<User> findUserByName(String userName) throws Exception;
	public abstract void insertUser(User user) throws Exception;
	public abstract User getUserByID(int id) throws Exception;
	public abstract void deleteUser(int id) throws Exception;
	public abstract void updateUser(User user) throws Exception;
	public abstract List<User> findUser(UserVo UserVo) throws Exception;
	public abstract List<User> getUserListByID(List list)  throws Exception;
	public abstract List<User> getUserByOrder()  throws Exception;
	public abstract List<User> findUserGoods() throws  Exception;
}
