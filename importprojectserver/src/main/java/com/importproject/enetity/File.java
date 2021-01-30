package com.importproject.enetity;

import java.io.Serializable;

public class File implements Serializable {
    private Integer fileid;

    private Integer directoryid;

    private String projectidF;

    private String filename;

    private String filedesc;

    private String projectrootF;

    private String filetype;

    private static final long serialVersionUID = 1L;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public Integer getDirectoryid() {
        return directoryid;
    }

    public void setDirectoryid(Integer directoryid) {
        this.directoryid = directoryid;
    }

    public String getProjectidF() {
        return projectidF;
    }

    public void setProjectidF(String projectidF) {
        this.projectidF = projectidF == null ? null : projectidF.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiledesc() {
        return filedesc;
    }

    public void setFiledesc(String filedesc) {
        this.filedesc = filedesc == null ? null : filedesc.trim();
    }

    public String getProjectrootF() {
        return projectrootF;
    }

    public void setProjectrootF(String projectrootF) {
        this.projectrootF = projectrootF == null ? null : projectrootF.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }
}