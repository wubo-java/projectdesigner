package com.importproject.enetity;

import java.io.Serializable;

public class Interface implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface_t.interfaceid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private String interfaceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface_t.implid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private Integer implid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface_t.interfacedesc
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private String interfacedesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface_t.interfacename
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private String interfacename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface_t.m_methodid_fk
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private Integer mMethodidFk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column interface_t.frameid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private Integer frameid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table interface_t
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interface_t.interfaceid
     *
     * @return the value of interface_t.interfaceid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public String getInterfaceid() {
        return interfaceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interface_t.interfaceid
     *
     * @param interfaceid the value for interface_t.interfaceid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid == null ? null : interfaceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interface_t.implid
     *
     * @return the value of interface_t.implid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public Integer getImplid() {
        return implid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interface_t.implid
     *
     * @param implid the value for interface_t.implid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public void setImplid(Integer implid) {
        this.implid = implid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interface_t.interfacedesc
     *
     * @return the value of interface_t.interfacedesc
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public String getInterfacedesc() {
        return interfacedesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interface_t.interfacedesc
     *
     * @param interfacedesc the value for interface_t.interfacedesc
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public void setInterfacedesc(String interfacedesc) {
        this.interfacedesc = interfacedesc == null ? null : interfacedesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interface_t.interfacename
     *
     * @return the value of interface_t.interfacename
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public String getInterfacename() {
        return interfacename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interface_t.interfacename
     *
     * @param interfacename the value for interface_t.interfacename
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interface_t.m_methodid_fk
     *
     * @return the value of interface_t.m_methodid_fk
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public Integer getmMethodidFk() {
        return mMethodidFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interface_t.m_methodid_fk
     *
     * @param mMethodidFk the value for interface_t.m_methodid_fk
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public void setmMethodidFk(Integer mMethodidFk) {
        this.mMethodidFk = mMethodidFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column interface_t.frameid
     *
     * @return the value of interface_t.frameid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public Integer getFrameid() {
        return frameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column interface_t.frameid
     *
     * @param frameid the value for interface_t.frameid
     *
     * @mbggenerated Sun Jan 17 10:34:23 CST 2021
     */
    public void setFrameid(Integer frameid) {
        this.frameid = frameid;
    }
}