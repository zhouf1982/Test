package com.springboottest.tactics;

/**
 * @author zhoufeng
 */
public interface Trade {

  String name();

  /** 简单实例
   * @param xml 一个报文
   * @return 执行结果
   * @throws Exception 异常
   */
  public String exec(String xml) throws Exception;
}
