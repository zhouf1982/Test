package com.business.his;

import java.util.Map;

/**
 * @author zhoufeng
 */

public interface PersonRecord {

    /**
     * 注册个人信息
     * @param map 病人信息
     * @return    病人编号
     */
    public String insertPerson(Map map);

    /**
     * 修改个人信息
     * @param map 病人信息
     * @return    病人编号
     */
    public String updatePerson(Map map);
}
