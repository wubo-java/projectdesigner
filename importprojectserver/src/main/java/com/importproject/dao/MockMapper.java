package com.importproject.dao;


import com.importproject.enetity.Mock;

public interface MockMapper {
    int deleteByPrimaryKey(Integer mockid);

    int insert(Mock record);

    int insertSelective(Mock record);

    Mock selectByPrimaryKey(Integer mockid);

    int updateByPrimaryKeySelective(Mock record);

    int updateByPrimaryKey(Mock record);
}