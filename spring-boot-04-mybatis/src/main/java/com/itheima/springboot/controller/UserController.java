package com.itheima.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.springboot.pojo.User;
import com.itheima.springboot.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list/{userName}")
	public List<User> queryUserByName(@PathVariable String userName){
		return userService.queryUserByName(userName);
	}
	
	@RequestMapping("/list/all")
	public List<User> queryAll(){
		return userService.queryUsers();
	}


}
