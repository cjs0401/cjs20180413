package com.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springboot.properties.ItcastProperties;

@Controller
public class HelloWorldController {

	// 方式1
	@Autowired
	private Environment environment;
	
	//方式2
		@Value("${cn.itcast.name}")
		private String itcastName;
		@Value("${cn.itcast.url}")
		private String itcastUrl;
		@Value("${com.itheima.name}")
		private String itheimaName;
		
		//方式3;
		@Autowired
		private ItcastProperties itcastProperties;

	@ResponseBody
	@RequestMapping("/test")
	public String sayHello() {
		
		System.out.println("方式1：读取配置文件----------------------------------------");
		System.out.println("cn.itcast.name为：" + environment.getProperty("cn.itcast.name"));
		System.out.println("cn.itcast.url为：" + environment.getProperty("cn.itcast.url"));
		System.out.println("com.itheima.name为：" + environment.getProperty("com.itheima.name"));
		
		System.out.println("方式2：读取配置文件----------------------------------------");
		System.out.println("cn.itcast.name为：" + itcastName);
		System.out.println("cn.itcast.url为：" + itcastUrl);
		System.out.println("com.itheima.name为：" + itheimaName);
		
		System.out.println("方式3：读取配置文件----------------------------------------");
		System.out.println("cn.itcast.name为：" + itcastProperties.getName());
		System.out.println("cn.itcast.url为：" + itcastProperties.getUrl());
		return "Hello Wolrd!";
	}

}
