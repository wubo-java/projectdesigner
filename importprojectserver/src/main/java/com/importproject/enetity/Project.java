package com.importproject.enetity;

import java.io.Serializable;

public class Project implements Serializable {
    private Integer projectid;

    private String projectdesc;

    private String projectroot;

    private static final long serialVersionUID = 1L;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectdesc() {
        return projectdesc;
    }

    public void setProjectdesc(String projectdesc) {
        this.projectdesc = projectdesc == null ? null : projectdesc.trim();
    }

    public String getProjectroot() {
        return projectroot;
    }

    public void setProjectroot(String projectroot) {
        this.projectroot = projectroot == null ? null : projectroot.trim();
    }
}