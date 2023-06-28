package com.ram.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ram.dao.LoginDao;
import com.ram.model.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

	public void init() {
		loginDao = new LoginDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		try {
			if (loginDao.validate(login)) {
				// HttpSession session = request.getSession();
				// request.setAttribute("username",username);
				response.sendRedirect("loginSuccess.jsp");
			} else {
				response.sendRedirect("errorHandler.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
