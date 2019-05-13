package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bw.biz.UserService;
import com.bw.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UserController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping("/userslist")
	@ResponseBody
	public JSONObject list() {
		// 查询条件
		Map<String, Object> map = new HashMap<String, Object>();
		// 调用分页组件
		PageHelper.startPage(2, 2);

		List<User> list = userService.getUsers(map);

		PageInfo<User> pageInfo = new PageInfo<User>(list);
		//json转换
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("draw", 1);
		jsonObject.put("recordsTotal", pageInfo.getTotal());
		jsonObject.put("recordsFiltered", pageInfo.getTotal());
		jsonObject.put("data", pageInfo.getList());
		return jsonObject;
		
	}

}
