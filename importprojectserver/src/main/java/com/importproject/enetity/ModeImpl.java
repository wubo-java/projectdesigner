package com.importproject.enetity;

import java.io.Serializable;

public class ModeImpl implements Serializable {
    private Integer implid;

    private String implname;

    private String impldesc;

    private Integer iFrameid;

    private static final long serialVersionUID = 1L;

    public Integer getImplid() {
        return implid;
    }

    public void setImplid(Integer implid) {
        this.implid = implid;
    }

    public String getImplname() {
        return implname;
    }

    public void setImplname(String implname) {
        this.implname = implname == null ? null : implname.trim();
    }

    public String getImpldesc() {
        return impldesc;
    }

    public void setImpldesc(String impldesc) {
        this.impldesc = impldesc == null ? null : impldesc.trim();
    }

    public Integer getiFrameid() {
        return iFrameid;
    }

    public void setiFrameid(Integer iFrameid) {
        this.iFrameid = iFrameid;
    }
}