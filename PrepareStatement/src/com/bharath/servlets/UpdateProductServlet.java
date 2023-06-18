package com.bharath.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet("/updateServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private Connection connection;

	 private PreparedStatement pst;
	    
	    public  void init() {
	 	   try {
	 		   Class.forName("com.mysql.jdbc.Driver");
	 		   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDb","root","root");
	 		   pst = connection.prepareStatement("update product set price=? where id=?");
	 	   }catch(Exception e) {
	 		   e.printStackTrace();
	 	   }
	    }
	    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int price = Integer.parseInt(request.getParameter("price"));
		try {
			pst.setInt(1,price);
			pst.setInt(2, id);
			int result = pst.executeUpdate();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<b>"+result+" Product Updated");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
