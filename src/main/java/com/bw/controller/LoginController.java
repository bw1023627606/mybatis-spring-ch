package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bw.biz.UserService;
import com.bw.entity.User;

@Controller
public class LoginController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginS")
	public ModelAndView loginS(String userName, String passWord,@RequestParam("userType") String userFlag) {
		ModelAndView mv = new ModelAndView();
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(passWord);
		user.setUserFlag(Byte.parseByte(userFlag));
		User findUser = userService.findUser(user);
		if(findUser!=null) {
			mv.addObject("user", findUser);
			mv.setViewName("index");
			return mv;
		}else {
			mv.setViewName("error");
			return mv;
		}
	}
}
