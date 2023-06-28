package com.bhararth.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TransactionDao {
	public static void main(String args[] ){
	try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
			Statement st = con.createStatement();
			
			con.setAutoCommit(false);
		st.executeUpdate("update account set bal=bal-500 where accno = 1");
		
		st.executeUpdate("update account set bal=bal+500 where accno = 2");
			con.commit();
		
	}catch(Exception e) {
		e.printStackTrace();
		try {
		Connection con = null;
		con.close();
		con.rollback();
	}catch(Exception e1) {
		e1.printStackTrace();
	}
}
}
}
