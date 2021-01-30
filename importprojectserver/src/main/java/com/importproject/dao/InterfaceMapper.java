package com.importproject.dao;


import com.importproject.enetity.Interface;

public interface InterfaceMapper {
    int deleteByPrimaryKey(String interfaceid);

    int insert(Interface record);

    int insertSelective(Interface record);

    Interface selectByPrimaryKey(String interfaceid);

    int updateByPrimaryKeySelective(Interface record);

    int updateByPrimaryKey(Interface record);
}