package com.javetest.mybatis.core.sqlsession;

public interface Excutor {
    public <T> T query(String statement, Object parameter);
}
