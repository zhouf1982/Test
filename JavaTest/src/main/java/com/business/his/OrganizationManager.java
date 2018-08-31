package com.business.his;

import java.util.Map;

/**
 * @author zhoufeng
 */
public interface OrganizationManager {
    /**
     * 验证机构信息
     * @param map 机构信息
     * @return 验证结果
     */
    public String verifyOrganization(Map map);
}
