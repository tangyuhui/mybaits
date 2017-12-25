package com.tang.mybatis.vo;

import java.util.List;

import com.tang.mybatis.po.User;

public class UserVo {
	private List<Integer> idList;
	private User user;
	
	public UserVo(User user) {
		super();
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserVo [user=" + user + "]";
	}

	public UserVo() {
		super();
	}

	
	public User getUser() {
		return user;
	}

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
