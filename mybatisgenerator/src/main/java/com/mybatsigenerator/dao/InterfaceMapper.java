package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.Interface;

public interface InterfaceMapper {
    int deleteByPrimaryKey(String interfaceid);

    int insert(Interface record);

    int insertSelective(Interface record);

    Interface selectByPrimaryKey(String interfaceid);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);
}