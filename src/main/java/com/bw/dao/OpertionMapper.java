package com.bw.dao;

import com.bw.entity.Opertion;

public interface OpertionMapper {
    int deleteByPrimaryKey(Long opertionId);

    int insert(Opertion record);

    int insertSelective(Opertion record);

    Opertion selectByPrimaryKey(Long opertionId);

    int updateByPrimaryKeySelective(Opertion record);

    int updateByPrimaryKey(Opertion record);
}