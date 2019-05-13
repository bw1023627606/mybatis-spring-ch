package com.bw.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.biz.MenuService;
import com.bw.entity.Menu;
import com.bw.vo.MenuVo;

@Controller
public class MenuController {
	
	private MenuService menuService;
	
	@Autowired
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
	@RequestMapping("/treeMenu")
	@ResponseBody
	public List<MenuVo> getTreeMenu(){
		//数据库数据
		List<Menu> menus = menuService.getAllMenu();
		
		//前段展示树形结构数据
		List<MenuVo> menuVos = getTree(menus);
		
		return menuVos;
		
	}
	
	//树形结构数据转换
	private List<MenuVo> getTree(List<Menu> menus){
		List<MenuVo> menuVos = null;
		if(menus!=null) {
			menuVos = new ArrayList<MenuVo>();
			for (Menu menu : menus) {
				MenuVo menuVo = new MenuVo();
				if(menu.getMenuParentId()==null||menu.getMenuParentId()==0) {
					menuVo.setText(menu.getMenuName());
					List<MenuVo> nodes = getChildTree(menu.getMenuId(), menus);
					if(nodes!=null) {
						menuVo.setNodes(nodes);
					}
					menuVos.add(menuVo);
				}
			
			}
			
		}
		
		return menuVos;
		
	}
	
	private List<MenuVo> getChildTree(Long pId,List<Menu> menus){
		MenuVo menuVo = null;
		List<MenuVo> menuVos = null;
		if(menus!=null) {
			menuVos=new ArrayList<MenuVo>();
			for (Menu menu : menus) {
				if(menu.getMenuId()!=null&&menu.getMenuId()!=0&&menu.getMenuParentId()==pId) {
					menuVo=new MenuVo();
					menuVo.setText(menu.getMenuName());
					menuVo.setNodes(getChildTree(menu.getMenuId(),menus));
					menuVos.add(menuVo);
				}
			}
		}
		
		return menuVos;
	}
	
	
	
	
}
