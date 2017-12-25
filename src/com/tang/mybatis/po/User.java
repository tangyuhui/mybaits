package com.tang.mybatis.po;

import java.util.List;

public class User {
	private int id;
	private String username;
	private int age;
	private int sex;
	private List<Orders> Orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Orders> getOrders() {
		return Orders;
	}

	public void setOrders(List<Orders> orders) {
		Orders = orders;
	}

}
