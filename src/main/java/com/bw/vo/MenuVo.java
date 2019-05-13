package com.bw.vo;

import java.io.Serializable;
import java.util.List;

public class MenuVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3494984103017025531L;
	private String text;
	private List<MenuVo> nodes;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<MenuVo> getNodes() {
		return nodes;
	}
	public void setNodes(List<MenuVo> nodes) {
		this.nodes = nodes;
	}
	

}
