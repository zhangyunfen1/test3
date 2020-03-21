package com.jt.controller;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value="classpath:properties/student.properties",encoding="utf-8")
public class HelloController {
	@Value("${demo.name}")
	private String name;
	@Value("${demo.age}")
	private Integer age;
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "你好";
	}
	@RequestMapping("/getDemo")
	public String getDemo() {
		return "name="+name+"age="+age;
	}
}
