package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.entity.User;

@RestController
public class UserController {
	@Autowired
	ApplicationContext applicationContext;
//	@Autowired
//	private User user;
	@RequestMapping("getUsers")
	public String getUsers() {
		User user = (User)applicationContext.getBean("user1");
		Integer id = user.getId();
		String name = user.getUsername();
		return "name="+name+","+"id="+id;
	}
}
