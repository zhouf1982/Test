package com.business.his;

import java.util.Map;

/**
 * @author zhoufeng
 */
public interface InvoiceManager {

    /**
     * 增加发票信息
     * @param map 发票信息
     * @return 费用序号
     */
    public String insertInvoice(Map map);

    /**
     * 删除发票信息
     * @param map 发票信息
     * @return 处理结果
     */
    public String deleteInvoice(Map map);
}
