package com.javatest.test;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        String url;
        String driver;
        String userName;
        String password;

        url = "jdbc:postgresql://localhost:5432/mytest2018";
        driver = "org.postgresql.Driver";
        userName = "postgres";
        password = "power";

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

            String sql = "select * from t_test";



            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "\t"
                        + resultSet.getString(2) + "\t"
                + resultSet.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
