package com.tang.mybatis.po;

import java.util.ArrayList;
import java.util.List;

import com.tang.mybatis.MenuUtil;

public class Menu {
	private int id;
	private List<Menu> menuList;
	private int parentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(int id, int parentId) {
		super();
		this.id = id;
		this.parentId = parentId;
	}

	public static void main(String[] args) {
		Menu mu1 = new Menu(1,0);
		Menu mu2 = new Menu(2,0);
		Menu mu3 = new Menu(3,1);
		Menu mu4 = new Menu(4,2);
		Menu mu5 = new Menu(5,2);
		List<Menu> menuList = new ArrayList<Menu>();
		menuList.add(mu1);
		menuList.add(mu2);
		menuList.add(mu3);
		List<Menu> rootMenuList = MenuUtil.getParentMenu(menuList);
		
		for(int i = 0; i< rootMenuList.size(); i++){
		  Menu menu=rootMenuList.get(i);
		  int pid = menu.getId();
		  menu.setMenuList(Menu.getChild(pid,menuList));
		}
		System.out.println(rootMenuList);
	}
	
	public static List<Menu> getChild(int id,List<Menu> menuData){
		List<Menu> childList  =  new ArrayList<Menu>();
		for(int i =0 ; i<menuData.size();i++){
			 Menu childMenu  =menuData.get(i);
			if(childMenu.getParentId()==id){
				childMenu.setMenuList(Menu.getChild(childMenu.getId(),menuData));
				childList.add(childMenu);
			}
			
		}
		 return  childList;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", menuList=" + menuList + ", parentId=" + parentId + "]";
	}
}
