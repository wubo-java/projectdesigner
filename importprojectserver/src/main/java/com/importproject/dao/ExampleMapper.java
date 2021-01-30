package com.importproject.dao;


import com.importproject.enetity.Example;

public interface ExampleMapper {
    int deleteByPrimaryKey(Integer exampleId);

    int insert(Example record);

    int insertSelective(Example record);

    Example selectByPrimaryKey(Integer exampleId);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);
}