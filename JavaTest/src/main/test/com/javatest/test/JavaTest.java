package com.javatest.test;

import com.javatest.test.base.TestBase;
import com.mybatis.mapper.TTestMapper;
import com.zhoufeng.utils.MD5;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class JavaTest extends TestBase {
    @Autowired
    TTestMapper tTestMapper;

    @Test
    public void JavaTestHello() {
        tTestMapper.selectAll().forEach( tTest -> {
            System.out.println(tTest.getId() + "\t" + tTest.getKey() + "\t" + tTest.getVal());
        });
    }

    @Test
    public void MD5Test() {
        try {
            System.out.println(MD5.md5("zhoufeng"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
