package com.importproject.enetity;

import java.io.Serializable;

public class Method implements Serializable {
    private Integer methodid;

    private Integer fileid;

    private String projectidM;

    private String methodname;

    private String methoddesc;

    private static final long serialVersionUID = 1L;

    public Integer getMethodid() {
        return methodid;
    }

    public void setMethodid(Integer methodid) {
        this.methodid = methodid;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getProjectidM() {
        return projectidM;
    }

    public void setProjectidM(String projectidM) {
        this.projectidM = projectidM == null ? null : projectidM.trim();
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    public String getMethoddesc() {
        return methoddesc;
    }

    public void setMethoddesc(String methoddesc) {
        this.methoddesc = methoddesc == null ? null : methoddesc.trim();
    }
}