package com.ram.jdbc.jdbcapp02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String args[]){
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
                PreparedStatement pst = connection.prepareStatement("select * from employee");
                ResultSet resultSet  = pst.executeQuery();
                ){
            System.out.println("eid\tename\tesal\teaddr");
            System.out.println("-----------------------------------");
            while(resultSet.next()){
                System.out.print(resultSet.getInt("eid")+"\t");
                System.out.print(resultSet.getString("ename")+"\t");
                System.out.print(resultSet.getFloat("esal")+"\t");
                System.out.print(resultSet.getString("eaddr")+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
