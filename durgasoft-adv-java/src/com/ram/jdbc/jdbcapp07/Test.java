package com.ram.jdbc.jdbcapp07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String args[]){
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root");
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery("select * from student");
                ){
            resultSet.afterLast();
            resultSet.previous();
            System.out.println(resultSet.getString("sid"));

            resultSet.beforeFirst();
            resultSet.next();
            System.out.println(resultSet.getString("sid"));

            resultSet.last();
            System.out.println(resultSet.getString("sid"));

            resultSet.first();
            System.out.println(resultSet.getString("sid"));

            resultSet.absolute(5);
            System.out.println(resultSet.getString("sid"));



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
