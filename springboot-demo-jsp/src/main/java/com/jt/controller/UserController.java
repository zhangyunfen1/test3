package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<User> list = userMapper.selectList(null);
		model.addAttribute("userList", list);
		return "userList";
	}
	@RequestMapping("toPage")
	public String toPage() {
		return "userList-ajax";
	}
	@RequestMapping("getData")
	@ResponseBody
	public List<User> getData(){
		List<User> list = userMapper.selectList(null);
		return list;
	}
	@RequestMapping("aa")
	@ResponseBody
	public String aa() {
		return "还好";
	}
	
	
}
