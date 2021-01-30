package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.Directory;

public interface DirectoryMapper {
    int deleteByPrimaryKey(Integer directoryid);

    int insert(Directory record);

    int insertSelective(Directory record);

    Directory selectByPrimaryKey(Integer directoryid);

    int updateByPrimaryKeySelective(Directory record);

    int updateByPrimaryKey(Directory record);
}