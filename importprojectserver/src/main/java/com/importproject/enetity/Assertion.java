package com.importproject.enetity;

import java.io.Serializable;

public class Assertion implements Serializable {
    private Integer assetid;

    private String assetname;

    private String assetdesc;

    private String assetvalue;

    private Integer assetFrameid;

    private static final long serialVersionUID = 1L;

    public Integer getAssetid() {
        return assetid;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    public String getAssetdesc() {
        return assetdesc;
    }

    public void setAssetdesc(String assetdesc) {
        this.assetdesc = assetdesc == null ? null : assetdesc.trim();
    }

    public String getAssetvalue() {
        return assetvalue;
    }

    public void setAssetvalue(String assetvalue) {
        this.assetvalue = assetvalue == null ? null : assetvalue.trim();
    }

    public Integer getAssetFrameid() {
        return assetFrameid;
    }

    public void setAssetFrameid(Integer assetFrameid) {
        this.assetFrameid = assetFrameid;
    }
}