package com.javetest.mybatis.core.config;

import java.util.List;

public class MapperBean {
    private String interfaceName;
    private List<Function> list;

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public List<Function> getList() {
        return list;
    }

    public void setList(List<Function> list) {
        this.list = list;
    }
}
