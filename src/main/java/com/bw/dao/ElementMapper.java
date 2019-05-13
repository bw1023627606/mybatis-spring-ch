package com.bw.dao;

import com.bw.entity.Element;

public interface ElementMapper {
    int deleteByPrimaryKey(Long elementId);

    int insert(Element record);

    int insertSelective(Element record);

    Element selectByPrimaryKey(Long elementId);

    int updateByPrimaryKeySelective(Element record);

    int updateByPrimaryKey(Element record);
}