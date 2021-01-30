package com.mybatsigenerator.model;

import java.io.Serializable;

public class ModeMethod implements Serializable {
    private Integer mMethodidM;

    private String interfaceid;

    private Integer abstractid;

    private Integer implid;

    private String mMethodname;

    private String mMethoddesc;

    private String mReturntype;

    private String mDescribetype;

    private Integer mFrameid;

    private static final long serialVersionUID = 1L;

    public Integer getmMethodidM() {
        return mMethodidM;
    }

    public void setmMethodidM(Integer mMethodidM) {
        this.mMethodidM = mMethodidM;
    }

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid == null ? null : interfaceid.trim();
    }

    public Integer getAbstractid() {
        return abstractid;
    }

    public void setAbstractid(Integer abstractid) {
        this.abstractid = abstractid;
    }

    public Integer getImplid() {
        return implid;
    }

    public void setImplid(Integer implid) {
        this.implid = implid;
    }

    public String getmMethodname() {
        return mMethodname;
    }

    public void setmMethodname(String mMethodname) {
        this.mMethodname = mMethodname == null ? null : mMethodname.trim();
    }

    public String getmMethoddesc() {
        return mMethoddesc;
    }

    public void setmMethoddesc(String mMethoddesc) {
        this.mMethoddesc = mMethoddesc == null ? null : mMethoddesc.trim();
    }

    public String getmReturntype() {
        return mReturntype;
    }

    public void setmReturntype(String mReturntype) {
        this.mReturntype = mReturntype == null ? null : mReturntype.trim();
    }

    public String getmDescribetype() {
        return mDescribetype;
    }

    public void setmDescribetype(String mDescribetype) {
        this.mDescribetype = mDescribetype == null ? null : mDescribetype.trim();
    }

    public Integer getmFrameid() {
        return mFrameid;
    }

    public void setmFrameid(Integer mFrameid) {
        this.mFrameid = mFrameid;
    }
}