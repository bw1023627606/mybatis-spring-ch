package com.bw.dao;

import java.util.List;
import java.util.Map;

import com.bw.entity.User;

public interface UserMapper {
	int deleteByPrimaryKey(Long userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Long userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	/**
	 * 根据条件查询
	 * 
	 * @param pageMap
	 * @return
	 */
	List<User> selectUsers(Map<String, Object> pageMap);
	
	User getUser(User user);
	
	List<User> getUsers();
	
}