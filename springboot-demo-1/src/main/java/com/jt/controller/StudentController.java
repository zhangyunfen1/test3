package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.entity.User;

@RestController
@ConfigurationProperties(prefix="student")
public class StudentController {
	@Autowired
	User user;
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@RequestMapping("getStudent")
	public String getStudent() {
		return "name="+name+"\n"+"age="+age;
	}
	@RequestMapping("getUser")
	public String getUser() {
		
		Integer id = user.getId();
		String name = user.getUsername();
		return "id="+id+"\n"+"name="+name;
	}
	
}
