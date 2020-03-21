package com.jt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jt.entity.User;

@Configuration
public class UserConfig {
	@Value("2")
	private Integer id;
	@Value("孙悟空")
	private String username;
	@Bean
	public User user1() {		
		return new User(id, username);
	}
	
}
