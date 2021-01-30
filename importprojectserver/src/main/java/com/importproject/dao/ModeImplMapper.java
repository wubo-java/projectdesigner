package com.importproject.dao;


import com.importproject.enetity.ModeImpl;

public interface ModeImplMapper {
    int deleteByPrimaryKey(Integer implid);

    int insert(ModeImpl record);

    int insertSelective(ModeImpl record);

    ModeImpl selectByPrimaryKey(Integer implid);

    int updateByPrimaryKeySelective(ModeImpl record);

    int updateByPrimaryKey(ModeImpl record);
}