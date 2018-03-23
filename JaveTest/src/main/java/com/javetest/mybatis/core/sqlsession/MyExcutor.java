package com.javetest.mybatis.core.sqlsession;

import com.javetest.mybatis.bean.SysUsers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyExcutor implements Excutor {
    private MyConfiguration xmlConfiguration = new MyConfiguration();

    @Override
    public <T> T query(String sql, Object parameter) {
        Connection connection = getConnection();
        ResultSet set = null;
        PreparedStatement pre = null;
        try {
            assert connection != null;
            pre = connection.prepareStatement(sql);
            pre.setLong(1, Long.parseLong((String) parameter));
            set = pre.executeQuery();
            SysUsers user = new SysUsers();

            while (set.next()) {
                user.setId(set.getLong(1));
                user.setNickName(set.getString("nickName"));
            }

            return (T)user;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) {
                    set.close();
                }
                if (pre != null) {
                    pre.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Connection getConnection() {
        Connection connection = null;
        try {
            connection = xmlConfiguration.build("data-configuration.xml");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
