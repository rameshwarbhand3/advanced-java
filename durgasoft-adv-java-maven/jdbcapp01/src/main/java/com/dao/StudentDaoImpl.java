package com.dao;

import com.ram.jdbc.jdbcapp01.bean.Student;
import com.ram.jdbc.jdbcapp01.factories.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDaoImpl implements StudentDao {

    @Override
    public String add(Student student) {
     String status = "";
     try{
         Connection connection = ConnectionFactory.getConnection();
         Statement statement = connection.createStatement();
         int rowCount = statement.executeUpdate("insert into student values('"+student.getSid()+"','"+student.getSname()+"','"+student.getAddr()+"')");
         if(rowCount == 1){
             status = "Success";
         }else{
             status = "Failure";
         }
     }catch (Exception e){
         status = "Failure";
         e.printStackTrace();
     }
     return status;
    }

    @Override
    public Student search(String sid) {
        Student student = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student where SID = '"+sid+"'");
            boolean b = resultSet.next();
            if(b == true) {
                student = new Student();
                student.setSid(resultSet.getString("sid"));
                student.setSname(resultSet.getString("sname"));
                student.setAddr(resultSet.getString("addr"));
            }else {
                student = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;

    }

    @Override
    public String update(Student student) {
       String status = "";
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate("update student set sname = '"+student.getSname()+"', addr = '"+student.getAddr()+"' where sid = '"+student.getSid()+"'");
            if(rowCount == 1) {
                status = "SUCCESS";
            }else {
                status = "FAILURE";
            }
        } catch (Exception e) {
            status = "FAILURE";
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public String delete(String sid) {
        String status = "";
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate("delete from student where SID = '"+sid+"'");
            if(rowCount == 1) {
                status = "SUCCESS";
            }else {
                status = "FAILURE";
            }
        } catch (Exception e) {
            status = "FAILURE";
            e.printStackTrace();
        }
        return status;

    }
}
