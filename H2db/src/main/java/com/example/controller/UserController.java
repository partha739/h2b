package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.UserDao;
import com.example.model.stud;


@Controller
public class UserController {
	@Autowired
	UserDao userdao;
	@RequestMapping("/index")
	public String user()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addUser")
	public String addUser(stud user)
	{
		userdao.save(user);
		return "index.jsp";
	}

}
