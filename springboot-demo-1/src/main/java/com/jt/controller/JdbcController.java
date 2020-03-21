package com.jt.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="jdbc")
public class JdbcController {
	private String url;
	private String username;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@RequestMapping("getJdbc")
	public String getJdbc() {
		return "url="+url+"\r\n"+"username="+username;
	}
}
