package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.ModeImpl;

public interface ModeImplMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mode_impl_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int deleteByPrimaryKey(Integer implid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mode_impl_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int insert(ModeImpl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mode_impl_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int insertSelective(ModeImpl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mode_impl_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    ModeImpl selectByPrimaryKey(Integer implid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mode_impl_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int updateByPrimaryKeySelective(ModeImpl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mode_impl_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int updateByPrimaryKey(ModeImpl record);
}