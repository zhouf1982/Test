package com.business.third;

/**
 * @author zhoufeng
 */
public interface InterfaceForWs {

    /**
     * 给第三方的接口方法
     * @param tradeType 交易类型
     * @param tradeMsg  交易入参
     * @param tradeOut 交易出参
     * @return 处理结果标识
     */
    public String runService(String tradeType, String tradeMsg, String tradeOut);
}
