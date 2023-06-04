package com.ram.jdbc.jdbcapp06;

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
            System.out.println("student details in forward direction: ");
            System.out.println("sid\tsname\taddr");
            while(resultSet.next()) {
                System.out.print(resultSet.getString("sid")+"\t");
                System.out.print(resultSet.getString("sname")+"\t");
                System.out.print(resultSet.getString("addr")+"\n");
            }
            System.out.println();

            System.out.println("Employee Details in Backward Direction");
            System.out.println("sid\tsname\taddr");

            System.out.println("-------------------------------");
            while(resultSet.previous()) {
                System.out.print(resultSet.getString("sid")+"\t");
                System.out.print(resultSet.getString("sname")+"\t");
                System.out.print(resultSet.getString("addr")+"\n");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
