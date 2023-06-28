package com.ram.jdbc.jdbcapp014;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static  void main(String args[]){
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
                Statement st = connection.createStatement();
                ){

            st.addBatch("insert into employee values(999,'onkar',8000,'dange')");
           st.addBatch("update employee set eid=444 where ename='Ram'");
           st.addBatch("delete from employee where eid=888");




            int[] rowCounts = st.executeBatch();
            for(int rowCount : rowCounts){
                System.out.println(rowCount);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
