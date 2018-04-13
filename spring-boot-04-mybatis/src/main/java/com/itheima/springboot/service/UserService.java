package com.itheima.springboot.service;

import java.util.List;

import com.itheima.springboot.pojo.User;

public interface UserService {
	
	/**
	 * 根据名称模糊查询用户
	 * @param name 名称
	 * @return
	 */
	public List<User> queryUserByName(String name);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> queryUsers();
	
}


