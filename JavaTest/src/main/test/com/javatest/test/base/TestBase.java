package com.javatest.test.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/config/spring.xml"})
public class TestBase {
    @Test
    public void FirstRun() {
        System.out.println("this is test....");
    }
}
