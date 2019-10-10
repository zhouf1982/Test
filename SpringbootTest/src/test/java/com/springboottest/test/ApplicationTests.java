package com.springboottest.test;

import com.springboottest.domain.repository.TConnectTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
  @Autowired
  TConnectTestMapper tConnectTestMapper;

  @Test
  public void contextLoads() {
    System.out.println("test");
    tConnectTestMapper.selectAll().forEach(tConnectTest -> {
      System.out.println(tConnectTest.getTestid());
    });
  }

}
