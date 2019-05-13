package com.bw.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.biz.MenuService;
import com.bw.dao.MenuMapper;
import com.bw.entity.Menu;
@Service
public class MenuServiceImpl implements MenuService{
	
	private MenuMapper menuMapper;

	@Autowired
	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}

	@Override
	public List<Menu> getAllMenu() {
		List<Menu> menus = menuMapper.getAllMenus();
		return menus;
	}

}
