package com.bhararth.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDao {
public static void main(String args[]) {
	try(
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
			Statement st = con.createStatement();
			
			){
		ResultSet rs = st.executeQuery("select * from account");
		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();
		for(int i =1;i<=columnCount;i++) {
			System.out.println(metaData.getColumnName(i));
			System.out.println(metaData.getColumnTypeName(i));
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
