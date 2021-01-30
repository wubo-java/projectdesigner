package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.Example;

public interface ExampleMapper {
    int deleteByPrimaryKey(Integer exampleId);

    int insert(Example record);

    int insertSelective(Example record);

    Example selectByPrimaryKey(Integer exampleId);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);
}