package com.bharath.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/updateServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String passWord = request.getParameter("passWord");
		
		Statement st;
		try {
			st = connection.createStatement();
			int rowCount = st.executeUpdate("update user set password='"+passWord+"'where email='"+email+"'");
			PrintWriter out = response.getWriter();
			if(rowCount == 1) {
				out.print("<h2>Password updated</h2>");
			}
			else {
				out.print("<h2>Error while updating user</h2>");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
	}

	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
