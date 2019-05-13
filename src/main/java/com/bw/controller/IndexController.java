package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bw.biz.UserService;
import com.bw.entity.User;

@Controller
@RequestMapping("/")
public class IndexController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/index.html")
	public ModelAndView index() {
		User user = userService.getUser(1L);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("index");
		mView.addObject("user", user);
		return mView;
	}
	
	
	@RequestMapping("")
	public String goIndex() {
		return "login";
	}
}
