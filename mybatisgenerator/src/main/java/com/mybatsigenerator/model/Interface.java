package com.mybatsigenerator.model;

import java.io.Serializable;

public class Interface implements Serializable {
    private String interfaceid;

    private Integer implid;

    private String interfacedesc;

    private String interfacename;

    private Integer frameid;

    private static final long serialVersionUID = 1L;

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid == null ? null : interfaceid.trim();
    }

    public Integer getImplid() {
        return implid;
    }

    public void setImplid(Integer implid) {
        this.implid = implid;
    }

    public String getInterfacedesc() {
        return interfacedesc;
    }

    public void setInterfacedesc(String interfacedesc) {
        this.interfacedesc = interfacedesc == null ? null : interfacedesc.trim();
    }

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    public Integer getFrameid() {
        return frameid;
    }

    public void setFrameid(Integer frameid) {
        this.frameid = frameid;
    }
}