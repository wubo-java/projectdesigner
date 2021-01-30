package com.importproject.dao;


import com.importproject.enetity.Assertion;

public interface AssertionMapper {
    int deleteByPrimaryKey(Integer assetid);

    int insert(Assertion record);

    int insertSelective(Assertion record);

    Assertion selectByPrimaryKey(Integer assetid);

    int updateByPrimaryKeySelective(Assertion record);

    int updateByPrimaryKey(Assertion record);
}