package com.ram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ram.model.Login;
import com.ram.util.MD5HashGenerator;

public class LoginDao {

	private static final String SELECT_USER = "select * from users where username = ? and password = ?";

	public boolean validate(Login login) throws SQLException {
		boolean status = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/questionPaperGeneratorDb",
					"root", "root");
			PreparedStatement pst = connection.prepareStatement(SELECT_USER);
			String hashPassword = MD5HashGenerator.generate(login.getPassword());
			// System.out.println(hashPassword);
			pst.setString(1, login.getUsername());
			pst.setString(2, hashPassword);
			ResultSet rs = pst.executeQuery();
			status = rs.next();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;
	}
}
