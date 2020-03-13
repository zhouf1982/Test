package com.springboottest.tactics.realize;

import com.springboottest.tactics.Trade;
import org.springframework.stereotype.Component;

@Component
public class TradeMan implements Trade {

  @Override
  public String name() {
    return "TradeMan";
  }

  @Override
  public String exec(String xml) throws Exception {
    return "我是男人";
  }
}
