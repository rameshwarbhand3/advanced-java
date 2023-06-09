package com.ram.jdbc.jdbcapp010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
    public static void main(String args[]) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb", "root", "root");
                PreparedStatement pst = connection.prepareStatement("delete from employee where esal < ?");
        ) {
            pst.setInt(1, 4000);
            int rowCount = pst.executeUpdate();
            System.out.println("Employee deleted successfully " + rowCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
