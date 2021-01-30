package com.importproject.enetity;

import java.io.Serializable;

public class Example implements Serializable {
    private Integer exampleId;

    private Integer eFrameid;

    private String exampledesc;

    private String examplevalue;

    private static final long serialVersionUID = 1L;

    public Integer getExampleId() {
        return exampleId;
    }

    public void setExampleId(Integer exampleId) {
        this.exampleId = exampleId;
    }

    public Integer geteFrameid() {
        return eFrameid;
    }

    public void seteFrameid(Integer eFrameid) {
        this.eFrameid = eFrameid;
    }

    public String getExampledesc() {
        return exampledesc;
    }

    public void setExampledesc(String exampledesc) {
        this.exampledesc = exampledesc == null ? null : exampledesc.trim();
    }

    public String getExamplevalue() {
        return examplevalue;
    }

    public void setExamplevalue(String examplevalue) {
        this.examplevalue = examplevalue == null ? null : examplevalue.trim();
    }
}