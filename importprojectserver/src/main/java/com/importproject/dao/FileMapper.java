package com.importproject.dao;


import com.importproject.enetity.File;

import java.util.List;

public interface FileMapper {
    int deleteByPrimaryKey(Integer fileid);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer fileid);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);

    List<File> selectAll();
}