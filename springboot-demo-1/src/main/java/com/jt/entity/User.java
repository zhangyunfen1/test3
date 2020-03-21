package com.jt.entity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
//@ConfigurationProperties(prefix="user")
public class User {
	private Integer id;
	private String username;
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.username = name;
	}
	public User() {
		super();
	}
	
}
