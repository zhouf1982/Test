package com.springboottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoufeng
 */
@SpringBootApplication
@MapperScan("com.springboottest.domain.repository")
@RestController
public class SpringbootTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootTestApplication.class, args);
  }

}
