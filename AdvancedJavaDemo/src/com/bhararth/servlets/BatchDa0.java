package com.bhararth.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchDa0 {
	public static void main(String args[]) {
	try(
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
			Statement st = con.createStatement();
			
			){
		
		st.addBatch("insert into account values(1,'Bhand','Ram',1000)");
		st.addBatch("insert into account values(2,'Bhand','Sham',2000)");
		st.addBatch("insert into account values(3,'Bhand','Ravi',3000)");
		int[] result = st.executeBatch();
		for(int i= 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
