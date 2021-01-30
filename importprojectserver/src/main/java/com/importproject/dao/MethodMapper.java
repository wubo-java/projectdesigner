package com.importproject.dao;


import com.importproject.enetity.Method;

import java.util.List;

public interface MethodMapper {
    int deleteByPrimaryKey(Integer methodid);

    int insert(Method record);

    int insertSelective(Method record);

    Method selectByPrimaryKey(Integer methodid);

    int updateByPrimaryKeySelective(Method record);

    int updateByPrimaryKey(Method record);

    List<Method> selectAll();
}