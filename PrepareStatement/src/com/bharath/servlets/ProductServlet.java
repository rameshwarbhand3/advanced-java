package com.bharath.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private Connection connection;

private PreparedStatement pst;
   
   public  void init() {
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
		   pst = connection.prepareStatement("insert into product values(?,?,?,?)");
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String desc = request.getParameter("description");
		int  price = Integer.parseInt(request.getParameter("price"));
		
		try {
			
			pst.setInt(1,id);
			pst.setString(2, name);
			pst.setString(3, desc);
			pst.setInt(4, price);
			
			int result = pst.executeUpdate();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<b>"+ result + " product created");
		}catch(Exception e) {
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
