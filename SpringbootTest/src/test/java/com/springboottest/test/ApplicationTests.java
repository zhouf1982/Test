package com.springboottest.test;

import com.springboottest.domain.repository.TConnectTestMapper;
import com.springboottest.tactics.Resolver;
import com.springboottest.tactics.Trade;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
  @Resource
  TConnectTestMapper tConnectTestMapper;

  @Test
  public void contextLoads() {
    System.out.println("test");
    tConnectTestMapper.selectAll().forEach(tConnectTest -> {
      System.out.println(tConnectTest.getTestid());
    });
  }

  @Autowired
  Resolver resolver;

  @Test
  public void tacticsTest() throws Exception{
    Trade trade = resolver.getHandler("TradeWoman");

    System.out.println(trade.exec(""));
  }

}
