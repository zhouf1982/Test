package com.springboottest.quartz;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zhoufeng
 */
@Component
public class QuartzTest {
  @Scheduled(cron = "0 0/1 * * * ?")
  public void quartzTest(){
    System.out.printf("%s" , LocalDateTime.now());
  }
}
