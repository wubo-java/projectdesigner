package com.importproject.dao;


import com.importproject.enetity.Directory;

import java.util.List;

public interface DirectoryMapper {
    int deleteByPrimaryKey(Integer directoryid);

    int insert(Directory record);

    int insertSelective(Directory record);

    Directory selectByPrimaryKey(Integer directoryid);

    int updateByPrimaryKeySelective(Directory record);

    int updateByPrimaryKey(Directory record);

    List<Directory> selectAll();
}