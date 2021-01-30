package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.Mock;

public interface MockMapper {
    int deleteByPrimaryKey(Integer mockid);

    int insert(Mock record);

    int insertSelective(Mock record);

    Mock selectByPrimaryKey(Integer mockid);

    int updateByPrimaryKeySelective(Mock record);

    int updateByPrimaryKey(Mock record);
}