package com.importproject.dao;


import com.importproject.enetity.ModeMethod;

public interface ModeMethodMapper {
    int deleteByPrimaryKey(Integer mMethodidM);

    int insert(ModeMethod record);

    int insertSelective(ModeMethod record);

    ModeMethod selectByPrimaryKey(Integer mMethodidM);

    int updateByPrimaryKeySelective(ModeMethod record);

    int updateByPrimaryKey(ModeMethod record);
}