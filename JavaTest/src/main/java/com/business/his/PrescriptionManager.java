package com.business.his;

import java.util.Map;

/**
 * @author zhoufeng
 */
public interface PrescriptionManager {
    /**
     * 处方录入
     * @param map 处方信息
     * @return 处方序号
     */
    public String insertPrescription(Map map);

    /**
     * 删除（注销）处方信息
     * @param map 处方信息
     * @return 处理结果
     */
    public String deletePrescription(Map map);
}
