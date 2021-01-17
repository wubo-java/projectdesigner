package com.mybatsigenerator.model;

import java.io.Serializable;

public class ModeParam implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column model_param_t.paramid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private Integer paramid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column model_param_t.m_methodid_m
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private Integer mMethodidM;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column model_param_t.paramtype
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private String paramtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column model_param_t.paramdesc
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private String paramdesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column model_param_t.p_frameid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private Integer pFrameid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table model_param_t
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column model_param_t.paramid
     *
     * @return the value of model_param_t.paramid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public Integer getParamid() {
        return paramid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column model_param_t.paramid
     *
     * @param paramid the value for model_param_t.paramid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column model_param_t.m_methodid_m
     *
     * @return the value of model_param_t.m_methodid_m
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public Integer getmMethodidM() {
        return mMethodidM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column model_param_t.m_methodid_m
     *
     * @param mMethodidM the value for model_param_t.m_methodid_m
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setmMethodidM(Integer mMethodidM) {
        this.mMethodidM = mMethodidM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column model_param_t.paramtype
     *
     * @return the value of model_param_t.paramtype
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public String getParamtype() {
        return paramtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column model_param_t.paramtype
     *
     * @param paramtype the value for model_param_t.paramtype
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setParamtype(String paramtype) {
        this.paramtype = paramtype == null ? null : paramtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column model_param_t.paramdesc
     *
     * @return the value of model_param_t.paramdesc
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public String getParamdesc() {
        return paramdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column model_param_t.paramdesc
     *
     * @param paramdesc the value for model_param_t.paramdesc
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setParamdesc(String paramdesc) {
        this.paramdesc = paramdesc == null ? null : paramdesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column model_param_t.p_frameid
     *
     * @return the value of model_param_t.p_frameid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public Integer getpFrameid() {
        return pFrameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column model_param_t.p_frameid
     *
     * @param pFrameid the value for model_param_t.p_frameid
     *
     * @mbggenerated Sun Jan 17 10:55:21 CST 2021
     */
    public void setpFrameid(Integer pFrameid) {
        this.pFrameid = pFrameid;
    }
}