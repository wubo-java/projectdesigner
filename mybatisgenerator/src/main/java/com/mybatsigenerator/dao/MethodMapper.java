package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.Method;

public interface MethodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int deleteByPrimaryKey(Integer methodid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int insert(Method record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int insertSelective(Method record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    Method selectByPrimaryKey(Integer methodid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int updateByPrimaryKeySelective(Method record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table method_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int updateByPrimaryKey(Method record);
}