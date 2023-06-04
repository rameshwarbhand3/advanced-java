package com.ram.jdbc.jdbcapp05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Test {
    public static void main(String args[]) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");
                Statement statement = connection.createStatement();
        ) {
            System.out.println("table details : ");
            String tableName = bufferedReader.readLine();
            ResultSet resultSet = statement.executeQuery("select * from " + tableName);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int index = 1; index <= columnCount; index++) {
                System.out.print(metaData.getColumnName(index) + "\t");
            }
            System.out.println();
            System.out.println("------------------------------------------");
            while (resultSet.next()) {
                for (int index = 1; index <= columnCount; index++) {
                    System.out.print(resultSet.getString(index) + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
