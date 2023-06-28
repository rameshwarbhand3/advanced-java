package com.ram.jdbc.jdbcapp015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String args[]) {
        Connection connection = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactionDb", "root", "root");
            connection.setAutoCommit(false);
            System.out.print("Enter Source Account number : ");
            String sourceAccNo = bufferedReader.readLine();
            System.out.print("Enter Target Account number : ");
            String targetAccNo = bufferedReader.readLine();
            System.out.print("Transfer Amount : ");
            int transferAmount = Integer.parseInt(bufferedReader.readLine());

            PreparedStatement preparedStatement1 = connection.prepareStatement("update account set balance=balance-? where accNo=?");
            preparedStatement1.setInt(1, transferAmount);
            preparedStatement1.setString(2, sourceAccNo);

            PreparedStatement preparedStatement2 = connection.prepareStatement("update account set balance=balance+? where accNo=?");
            preparedStatement2.setInt(1, transferAmount);
            preparedStatement2.setString(2, targetAccNo);

            int rowCount1 = preparedStatement1.executeUpdate();
            int rowCount2 = preparedStatement2.executeUpdate();

            if (rowCount1 == 1 && rowCount2 == 1) {
                connection.commit();
                System.out.println("Transaction Success");
            } else {
                connection.rollback();
                System.out.println("Transaction Failure");
            }
        } catch (Exception e) {
            try {
                connection.rollback();
                System.out.println("Transaction Failure");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
