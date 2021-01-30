package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.Method;

public interface MethodMapper {
    int deleteByPrimaryKey(Integer methodid);

    int insert(Method record);

    int insertSelective(Method record);

    Method selectByPrimaryKey(Integer methodid);

    int updateByPrimaryKeySelective(Method record);

    int updateByPrimaryKey(Method record);
}