package com.tang.mybatis;

import java.util.ArrayList;
import java.util.List;

import com.tang.mybatis.po.Menu;

public class MenuUtil {
 public static List<Menu> getParentMenu(List<Menu> menuDataList){
	List<Menu> parentMenuList= new ArrayList<Menu>();
	for(Menu menuData:menuDataList){
		 if(menuData.getParentId()==0){
			 //是根节点
			 parentMenuList.add(menuData);
		 }
	}
	return parentMenuList;
 }
 
 public static void buildMenuTree(Menu menu){
	 
 }
}
