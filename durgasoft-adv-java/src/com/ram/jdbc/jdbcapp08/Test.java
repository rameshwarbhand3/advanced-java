package com.ram.jdbc.jdbcapp08;

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
                PreparedStatement pst = connection.prepareStatement("insert into employee values(?, ? ,?, ?)");
        ) {
            while (true) {
                System.out.println("Employee number : ");
                int eno = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Employee name : ");
                String ename = bufferedReader.readLine();
                System.out.println("Employee salary : ");
                float esal = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Employee address : ");
                String eaddr = bufferedReader.readLine();

                pst.setInt(1, eno);
                pst.setString(2, ename);
                pst.setFloat(3, esal);
                pst.setString(4, eaddr);
                int rowCount = pst.executeUpdate();
                if (rowCount == 1) {
                    System.out.println("Employee added successfully");
                } else {
                    System.out.println("Employee not added");
                }
                System.out.println("one more record inserted ? [yes/No]");
                String userOption = bufferedReader.readLine();
                if (userOption.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
