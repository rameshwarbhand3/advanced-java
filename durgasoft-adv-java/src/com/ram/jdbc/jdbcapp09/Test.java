package com.ram.jdbc.jdbcapp09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
    public static void main(String args[]) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb", "root", "root");
                PreparedStatement pst = connection.prepareStatement("update employee set esal = esal + ? where esal < ?");
        ) {
            System.out.print("Bonus Amount : ");
            int bonus = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Salary range : ");
            float salRange = Float.parseFloat(bufferedReader.readLine());

            pst.setInt(1, bonus);
            pst.setFloat(2, salRange);

            int rowCount = pst.executeUpdate();
            System.out.println("Employees Updated : " + rowCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
