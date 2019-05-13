package com.bw.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bw.biz.UserService;
import com.bw.dao.UserMapper;
import com.bw.entity.User;
@Service
public class UserServiceImpl implements UserService {
	
	private UserMapper userMapper;
	
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> getUsers(Map<String, Object> map) {
		return userMapper.selectUsers(map);
	}
	
	@Cacheable(value="aboutUser",key="'user_'+#id")
	@Override
	public User getUser(long id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public User addUser(User user) {
		int insert = userMapper.insert(user);
		if(insert>0) {
			return user;
		}
		return null;
	}

	@Override
	public User findUser(User user) {
		return userMapper.getUser(user);
	}
	
	@Cacheable(value = "aboutUser")
	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}
	
	

}
