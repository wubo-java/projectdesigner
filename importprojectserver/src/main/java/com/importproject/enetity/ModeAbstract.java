package com.importproject.enetity;

import java.io.Serializable;

public class ModeAbstract implements Serializable {
    private Integer abstractid;

    private Integer implid;

    private String abstractdesc;

    private String abstractname;

    private Integer aFrameid;

    private static final long serialVersionUID = 1L;

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

    public String getAbstractdesc() {
        return abstractdesc;
    }

    public void setAbstractdesc(String abstractdesc) {
        this.abstractdesc = abstractdesc == null ? null : abstractdesc.trim();
    }

    public String getAbstractname() {
        return abstractname;
    }

    public void setAbstractname(String abstractname) {
        this.abstractname = abstractname == null ? null : abstractname.trim();
    }

    public Integer getaFrameid() {
        return aFrameid;
    }

    public void setaFrameid(Integer aFrameid) {
        this.aFrameid = aFrameid;
    }
}