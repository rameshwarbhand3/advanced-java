package com.ram.jdbc.jdbcapp03;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Test {
    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");
        ) {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getDatabaseProductVersion());
            System.out.println(metaData.getDriverMajorVersion());
            System.out.println(metaData.getDriverMinorVersion());
            System.out.println(metaData.getSQLKeywords());
            System.out.println(metaData.getStringFunctions());
            System.out.println(metaData.getNumericFunctions());
            System.out.println(metaData.supportsBatchUpdates());
            System.out.println(metaData.supportsStoredProcedures());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
