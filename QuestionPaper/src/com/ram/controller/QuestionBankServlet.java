package com.ram.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ram.dao.QuestionDao;
import com.ram.model.Category;
import com.ram.model.Complexity;
import com.ram.model.Question;

/**
 * Servlet implementation class QuestionBankServlet
 */
@WebServlet("/")
public class QuestionBankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private QuestionDao questionDao = new QuestionDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();
		System.out.println(action);
		switch (action) {
		case "/insert":
			insertQuestion(req, resp);
			break;
		default:
			System.out.println("default action!!");
		}

	}

	private void insertQuestion(HttpServletRequest req, HttpServletResponse resp) {
		String questionName = req.getParameter("questionName");
		String option1 = req.getParameter("option1");
		String option2 = req.getParameter("option2");
		String option3 = req.getParameter("option3");
		String option4 = req.getParameter("option4");
		String correctAns = req.getParameter("correctAns");
		String category = req.getParameter("category");
		String complexity = req.getParameter("complexity");
		Question q = new Question();
		q.setQuestion(questionName);
		q.setOption1(option1);
		q.setOption2(option2);
		q.setOption3(option3);
		q.setOption4(option4);
		q.setCorrectAns(correctAns);
		q.setComplexity(Complexity.valueOf(complexity));
		q.setType(Category.valueOf(category));
		System.out.println("question=>" + q);
		questionDao.insertQuestion(q);
		
		// TODO: remove below - after insert should forward to list-question.jsp page
		try {
			PrintWriter pw = resp.getWriter();
			pw.println("<br>Question added successfully</br>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
