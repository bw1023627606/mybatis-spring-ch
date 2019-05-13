package com.bw.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bw.biz.UserService;
import com.bw.entity.User;

@Controller
@RequestMapping("/register")
public class RegisterController {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value="/page",method=RequestMethod.GET)
	public String page()
	{
		return "user/register";
	}
	
	
	@RequestMapping("/add")
	public ModelAndView add(String userName, String passWord, @RequestParam("retypePassWord") String retypePassWord,
			@RequestParam("userType") String userFlag,
			@RequestParam(value = "flag", defaultValue = "off") String flag) {
		
		ModelAndView mv = new ModelAndView();
		User addUser=null;
		if("on".equalsIgnoreCase(flag)) {
			if(passWord.equals(retypePassWord)) {
				User user = new User();
				user.setUserName(userName);
				user.setPassWord(passWord);
				user.setUserFlag(Byte.parseByte(userFlag));
				user.setUserDelete(Byte.parseByte(userFlag));
				user.setUpdateTime(new Date());
				user.setUpdateBy(1L);
				addUser = userService.addUser(user);
				mv.addObject("user", addUser);
			}
		}
		if(addUser==null) {
			mv.setViewName("error");
		}else {
			mv.setViewName("user/seccess");
		}
		
		return mv;
	}

}
