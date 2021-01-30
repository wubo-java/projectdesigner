package com.importproject.dao;


import com.importproject.enetity.ModeParam;

public interface ModeParamMapper {
    int deleteByPrimaryKey(Integer paramid);

    int insert(ModeParam record);

    int insertSelective(ModeParam record);

    ModeParam selectByPrimaryKey(Integer paramid);

    int updateByPrimaryKeySelective(ModeParam record);

    int updateByPrimaryKey(ModeParam record);
}