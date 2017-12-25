package com.tang.mybatis.vo;

import com.tang.mybatis.po.Orders;

public class OrdersCustomer extends Orders {
	private int age;
	private int sex;
	private String userName;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public OrdersCustomer(int age, int sex, String userName) {
		super();
		this.age = age;
		this.sex = sex;
		this.userName = userName;
	}

	public OrdersCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrdersCustomer [age=" + age + ", sex=" + sex + ", userName=" + userName + ", getId()=" + getId()
				+ ", getUser_id()=" + getUser_id() + ", getNumber()=" + getNumber() + ", getCreatTime()="
				+ getCreatTime() + ", getNote()=" + getNote() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
