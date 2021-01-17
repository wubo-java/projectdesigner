package com.mybatsigenerator.model;

import java.io.Serializable;

public class Directory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column directory_t.directoryid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private Integer directoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column directory_t.projectid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column directory_t.directorydesc
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private String directorydesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column directory_t.projectroot_d
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private String projectrootD;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column directory_t.directoryname
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private String directoryname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column directory_t.fileid_d_fk
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private Integer fileidDFk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table directory_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column directory_t.directoryid
     *
     * @return the value of directory_t.directoryid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public Integer getDirectoryid() {
        return directoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column directory_t.directoryid
     *
     * @param directoryid the value for directory_t.directoryid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setDirectoryid(Integer directoryid) {
        this.directoryid = directoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column directory_t.projectid
     *
     * @return the value of directory_t.projectid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column directory_t.projectid
     *
     * @param projectid the value for directory_t.projectid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column directory_t.directorydesc
     *
     * @return the value of directory_t.directorydesc
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public String getDirectorydesc() {
        return directorydesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column directory_t.directorydesc
     *
     * @param directorydesc the value for directory_t.directorydesc
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setDirectorydesc(String directorydesc) {
        this.directorydesc = directorydesc == null ? null : directorydesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column directory_t.projectroot_d
     *
     * @return the value of directory_t.projectroot_d
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public String getProjectrootD() {
        return projectrootD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column directory_t.projectroot_d
     *
     * @param projectrootD the value for directory_t.projectroot_d
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setProjectrootD(String projectrootD) {
        this.projectrootD = projectrootD == null ? null : projectrootD.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column directory_t.directoryname
     *
     * @return the value of directory_t.directoryname
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public String getDirectoryname() {
        return directoryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column directory_t.directoryname
     *
     * @param directoryname the value for directory_t.directoryname
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setDirectoryname(String directoryname) {
        this.directoryname = directoryname == null ? null : directoryname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column directory_t.fileid_d_fk
     *
     * @return the value of directory_t.fileid_d_fk
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public Integer getFileidDFk() {
        return fileidDFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column directory_t.fileid_d_fk
     *
     * @param fileidDFk the value for directory_t.fileid_d_fk
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setFileidDFk(Integer fileidDFk) {
        this.fileidDFk = fileidDFk;
    }
}