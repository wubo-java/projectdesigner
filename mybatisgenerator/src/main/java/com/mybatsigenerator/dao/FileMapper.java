package com.mybatsigenerator.dao;

import com.mybatsigenerator.model.File;

public interface FileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int deleteByPrimaryKey(Integer fileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int insert(File record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int insertSelective(File record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    File selectByPrimaryKey(Integer fileid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int updateByPrimaryKeySelective(File record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    int updateByPrimaryKey(File record);
}