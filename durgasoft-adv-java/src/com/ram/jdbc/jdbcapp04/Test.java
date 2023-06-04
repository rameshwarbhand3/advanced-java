package com.ram.jdbc.jdbcapp04;

import java.sql.*;

public class Test {
    public static void main(String args[]) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","root");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Employee");
        ) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int index = 1; index <= columnCount; index++) {
                System.out.println("Column Name    : " + metaData.getColumnName(index));
                System.out.println("Column Type    : " + metaData.getColumnTypeName(index));
                System.out.println("Column Size    : " + metaData.getColumnDisplaySize(index));
                System.out.println("---------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
