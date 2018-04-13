package com.itheima.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springboot.mapper.UserMapper;
import com.itheima.springboot.pojo.User;
import com.itheima.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryUserByName(String name) {
		return userMapper.queryUserByName(name);
	}

	@Override
	public List<User> queryUsers() {
		return userMapper.queryUsers();
	}



}
