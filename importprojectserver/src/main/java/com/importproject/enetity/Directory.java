package com.importproject.enetity;

import java.io.Serializable;

public class Directory implements Serializable {
    private Integer directoryid;

    private String projectidD;

    private String directorydesc;

    private String projectrootD;

    private String directoryname;

    private Integer directoryid_fk;

    private static final long serialVersionUID = 1L;

    public Integer getDirectoryid_fk() {
        return directoryid_fk;
    }

    public void setDirectoryid_fk(Integer directoryid_fk) {
        this.directoryid_fk = directoryid_fk;
    }

    public Integer getDirectoryid() {
        return directoryid;
    }

    public void setDirectoryid(Integer directoryid) {
        this.directoryid = directoryid;
    }

    public String getProjectidD() {
        return projectidD;
    }

    public void setProjectidD(String projectidD) {
        this.projectidD = projectidD == null ? null : projectidD.trim();
    }

    public String getDirectorydesc() {
        return directorydesc;
    }

    public void setDirectorydesc(String directorydesc) {
        this.directorydesc = directorydesc == null ? null : directorydesc.trim();
    }

    public String getProjectrootD() {
        return projectrootD;
    }

    public void setProjectrootD(String projectrootD) {
        this.projectrootD = projectrootD == null ? null : projectrootD.trim();
    }

    public String getDirectoryname() {
        return directoryname;
    }

    public void setDirectoryname(String directoryname) {
        this.directoryname = directoryname == null ? null : directoryname.trim();
    }
}