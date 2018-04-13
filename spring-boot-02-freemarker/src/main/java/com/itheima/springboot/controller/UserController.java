package com.itheima.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/fm")
@Controller
public class UserController {

	@RequestMapping("/query/{userId}")
	public String queryById(@PathVariable Long userId, Map<String, Object> root) {

		root.put("userId", userId);
		root.put("userName", "黑马-" + userId);

		// 说明在templates文件夹下有user/list.ftl模版文件
		return "user/list";
	}

	@RequestMapping("/query2/{userId}")
	public ModelAndView queryById2(@PathVariable Long userId) {
		ModelAndView mv = new ModelAndView("user/list");
		mv.addObject("userId", userId);
		mv.addObject("userName", "传智播客-" + userId);

		// 说明在templates文件夹下有user/list.ftl模版文件
		return mv;
	}
}
