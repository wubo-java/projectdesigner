package com.mybatsigenerator.model;

import java.io.Serializable;

public class ModeParam implements Serializable {
    private Integer paramid;

    private Integer mMethodidM;

    private String paramtype;

    private String paramdesc;

    private Integer pFrameid;

    private static final long serialVersionUID = 1L;

    public Integer getParamid() {
        return paramid;
    }

    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    public Integer getmMethodidM() {
        return mMethodidM;
    }

    public void setmMethodidM(Integer mMethodidM) {
        this.mMethodidM = mMethodidM;
    }

    public String getParamtype() {
        return paramtype;
    }

    public void setParamtype(String paramtype) {
        this.paramtype = paramtype == null ? null : paramtype.trim();
    }

    public String getParamdesc() {
        return paramdesc;
    }

    public void setParamdesc(String paramdesc) {
        this.paramdesc = paramdesc == null ? null : paramdesc.trim();
    }

    public Integer getpFrameid() {
        return pFrameid;
    }

    public void setpFrameid(Integer pFrameid) {
        this.pFrameid = pFrameid;
    }
}