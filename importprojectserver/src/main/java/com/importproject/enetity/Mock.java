package com.importproject.enetity;

import java.io.Serializable;

public class Mock implements Serializable {
    private Integer mockid;

    private String mockname;

    private String mockvalue;

    private String mockdesc;

    private Integer mockFrameid;

    private static final long serialVersionUID = 1L;

    public Integer getMockid() {
        return mockid;
    }

    public void setMockid(Integer mockid) {
        this.mockid = mockid;
    }

    public String getMockname() {
        return mockname;
    }

    public void setMockname(String mockname) {
        this.mockname = mockname == null ? null : mockname.trim();
    }

    public String getMockvalue() {
        return mockvalue;
    }

    public void setMockvalue(String mockvalue) {
        this.mockvalue = mockvalue == null ? null : mockvalue.trim();
    }

    public String getMockdesc() {
        return mockdesc;
    }

    public void setMockdesc(String mockdesc) {
        this.mockdesc = mockdesc == null ? null : mockdesc.trim();
    }

    public Integer getMockFrameid() {
        return mockFrameid;
    }

    public void setMockFrameid(Integer mockFrameid) {
        this.mockFrameid = mockFrameid;
    }
}