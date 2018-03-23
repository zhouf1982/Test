package com.javetest.test;

import com.javetest.mybatis.bean.SysUsers;
import com.javetest.mybatis.mapper.SysUsersMapper;
import com.javetest.mybatis.sqlsession.MySqlSession;
import org.junit.Test;

public class OwnerTest {
    @Test
    public void MyTest() {
        MySqlSession sqlSession = new MySqlSession();
        SysUsersMapper mapper = sqlSession.getMapper(SysUsersMapper.class);
        SysUsers users = mapper.getSysUserByid(Long.valueOf("999"));
        System.out.println(users.getNickName());
    }
}
