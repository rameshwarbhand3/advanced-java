package com.bharath.trainings.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebServlet(urlPatterns="/addition")
public class AdditionServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if ((request.getParameter("number1") != null && request.getParameter("number1").length()>0) && (request.getParameter("number2") != null && request.getParameter("number2").length()>0)) {
			Long num1 = Long.parseLong(request.getParameter("number1"));
			Long num2 = Long.parseLong(request.getParameter("number2"));

			PrintWriter out = response.getWriter();
			
			out.println("The Result Is " +(num1 + num2));
			
		}

	}

}