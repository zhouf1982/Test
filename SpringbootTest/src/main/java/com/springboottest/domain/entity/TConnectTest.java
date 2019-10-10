package com.springboottest.domain.entity;

import java.math.BigDecimal;

public class TConnectTest {
    private BigDecimal testid;

    private String testkey;

    private String testvalue;

    public BigDecimal getTestid() {
        return testid;
    }

    public void setTestid(BigDecimal testid) {
        this.testid = testid;
    }

    public String getTestkey() {
        return testkey;
    }

    public void setTestkey(String testkey) {
        this.testkey = testkey == null ? null : testkey.trim();
    }

    public String getTestvalue() {
        return testvalue;
    }

    public void setTestvalue(String testvalue) {
        this.testvalue = testvalue == null ? null : testvalue.trim();
    }
}