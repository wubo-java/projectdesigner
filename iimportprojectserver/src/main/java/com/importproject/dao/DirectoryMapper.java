package com.importproject.dao;

import com.importproject.enetity.Directory;

public interface DirectoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    int deleteByPrimaryKey(Integer directoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    int insert(Directory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    int insertSelective(Directory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    Directory selectByPrimaryKey(Integer directoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    int updateByPrimaryKeySelective(Directory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    int updateByPrimaryKey(Directory record);
}