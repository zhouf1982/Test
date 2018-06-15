package com.javatest.test;

import java.sql.*;
import java.util.Map;

public class JDBCTest {
    public static void main(String[] args) {
        String url;
        String driver;
        String userName;
        String password;

        url = "jdbc:postgresql://localhost:5432/mytest2017";
        driver = "org.postgresql.Driver";
        userName = "postgres";
        password = "zhoufeng";


        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = conn.createStatement();

            String sql = "select id, nickname from sys_users;";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "\t"
                        + resultSet.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
