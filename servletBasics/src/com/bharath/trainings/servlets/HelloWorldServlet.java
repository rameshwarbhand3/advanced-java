package com.bharath.trainings.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
//@WebServlet(urlPatterns="/hello")
public class HelloWorldServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpServletRequest req = (HttpServletRequest)request;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Hello World</h2>");
		out.println("</body>");
		out.println("</html>");

	}

}
