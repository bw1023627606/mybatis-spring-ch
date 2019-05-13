package com.bw.dao;

import com.bw.entity.MisFile;

public interface MisFileMapper {
    int deleteByPrimaryKey(Long fileId);

    int insert(MisFile record);

    int insertSelective(MisFile record);

    MisFile selectByPrimaryKey(Long fileId);

    int updateByPrimaryKeySelective(MisFile record);

    int updateByPrimaryKey(MisFile record);
}