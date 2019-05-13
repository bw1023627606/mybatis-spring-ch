package com.bw.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bw.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectByPrimaryKey() {
		User user = userMapper.selectByPrimaryKey(1L);
		System.out.println(user);
	}

}
