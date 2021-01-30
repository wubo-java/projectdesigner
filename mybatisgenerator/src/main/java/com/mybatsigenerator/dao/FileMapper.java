package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.File;

public interface FileMapper {
    int deleteByPrimaryKey(Integer fileid);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer fileid);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}