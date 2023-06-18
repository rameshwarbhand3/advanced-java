package com.ram.jdbc.jdbcapp011;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
    public static void main(String args[]) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb", "root", "root");
                PreparedStatement pst = conn.prepareStatement("insert into emp4 values(?,?)");
        ) {
            pst.setInt(1, 111);
            File file = new File("/home/pranjal/Desktop/workspace/advanced-java/durgasoft-adv-java/src/resourses/kodak_pixpro_fz201_01.jpg");
            FileInputStream fis = new FileInputStream(file);
            pst.setBinaryStream(2,fis,file.length());

            int rowCount = pst.executeUpdate();
            if(rowCount == 1){
                System.out.println("Employee Inserted Successfully");
            }else{
                System.out.println("Employee Insertion Failure");
            }
            fis.close();

    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
