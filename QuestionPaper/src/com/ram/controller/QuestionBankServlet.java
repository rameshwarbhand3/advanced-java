package com.ram.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

		case "/showEditForm":
			showEditForm(req, resp);
			break;

		case "/edit":
			editQuestion(req, resp);
			break;
			
		case "/delete":
            deleteQuestion(req, resp);
            break;

		default:
			// System.out.println("default action!!");
			listQuestions(req, resp);
		}

	}

	private void deleteQuestion(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int srno = Integer.parseInt(req.getParameter("srno"));	
		questionDao.deleteQuestion(srno);
		resp.sendRedirect("/QuestionPaper/list");
		
	}

	private void showEditForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int srno = Integer.parseInt(req.getParameter("srno"));
		Question existingQuestion = questionDao.findById(srno);
		req.setAttribute("question", existingQuestion);

		RequestDispatcher requestDispatcher = req
				.getRequestDispatcher("question-form.jsp");
		requestDispatcher.forward(req, resp);

	}

	private void editQuestion(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int srno = Integer.parseInt(req.getParameter("srno"));
		String questionName = req.getParameter("question");
		String optionA = req.getParameter("optionA");
		String optionB = req.getParameter("optionB");
		String optionC = req.getParameter("optionC");
		String optionD = req.getParameter("optionD");
		String correctAns = req.getParameter("correctAns");
		String category = req.getParameter("category");
		String complexity = req.getParameter("complexity");

		Question q = new Question();
		q.setSrno(srno);
		q.setQuestion(questionName);
		q.setOption1(optionA);
		q.setOption2(optionB);
		q.setOption3(optionC);
		q.setOption4(optionD);
		q.setCorrectAns(correctAns);
		q.setComplexity(Complexity.valueOf(complexity));
		q.setType(Category.valueOf(category));

		questionDao.update(q);

		resp.sendRedirect("/QuestionPaper/list");

	}

	private void listQuestions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Question> listQuestion = questionDao.findAll();
		req.setAttribute("listQuestion", listQuestion);
		// System.out.println(listQuestion);
		RequestDispatcher dispatcher = req.getRequestDispatcher("question-list.jsp");
		dispatcher.forward(req, resp);

	}

	private void insertQuestion(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String questionName = req.getParameter("question");
		String optionA = req.getParameter("optionA");
		String optionB = req.getParameter("optionB");
		String optionC = req.getParameter("optionC");
		String optionD = req.getParameter("optionD");
		String correctAns = req.getParameter("correctAns");
		String category = req.getParameter("category");
		String complexity = req.getParameter("complexity");

		Question q = new Question();
		q.setQuestion(questionName);
		q.setOption1(optionA);
		q.setOption2(optionB);
		q.setOption3(optionC);
		q.setOption4(optionD);
		q.setCorrectAns(correctAns);
		q.setComplexity(Complexity.valueOf(complexity));
		q.setType(Category.valueOf(category));
		// System.out.println("question=>" + q);
		questionDao.insert(q);

		resp.sendRedirect("/QuestionPaper/list");

	}

}
