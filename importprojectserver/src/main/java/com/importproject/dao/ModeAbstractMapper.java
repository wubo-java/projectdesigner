package com.importproject.dao;


import com.importproject.enetity.ModeAbstract;

public interface ModeAbstractMapper {
    int deleteByPrimaryKey(Integer abstractid);

    int insert(ModeAbstract record);

    int insertSelective(ModeAbstract record);

    ModeAbstract selectByPrimaryKey(Integer abstractid);

    int updateByPrimaryKeySelective(ModeAbstract record);

    int updateByPrimaryKey(ModeAbstract record);
}