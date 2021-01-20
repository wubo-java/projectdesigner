package com.importproject.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author laijinrong
 * @description 用于其他sql的操作，区别于数据库表文件
 * @date 2021/1/19
 */
@Mapper
public interface OtherSqlMapper {
    /**
     * 实现自增序列
     * @return
     */
    int querySequence();////add by laijinrong 2021/1/19
}
