package com.ram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ram.model.Category;
import com.ram.model.Complexity;
import com.ram.model.Question;

public class QuestionDao {
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/questionPaperGeneratorDb";
	private String jdbcUser = "root";
	private String jdbcPassword = "root";

	private static final String INSERT_QUESTION = "insert into questionBank"
			+ "(SrNo,Question,optionA,optionB,optionC,OptionD,CorrectAns,Category,Complexity)values"
			+ "(null,?,?,?,?,?,?,?,?)";

	private static final String SELECT_QUESTION = "select * from questionBank where srNo=?";

	private static final String SELECT_ALL_QUESTIONS = "select * from questionBank";

	private static final String UPDATE_QUESTION = "update questionBank set Question=?,optionA=?,optionB=?,optionC=?,optionD=?,correctAns=?,Category=?,complexity=? where srNo=?";

	private static final String DELETE_Question = "delete from questionBank where srNo=?";

	private static final String FIND_BY_CATEGORY_QUESTION = "select * from questionBank where category=?";

	private static final String FIND_BY_COMPLEXITY_QUESTION = "select * from questionBank where complexity=?";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void insert(Question question) {
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(INSERT_QUESTION)) {
			pst.setString(1, question.getQuestion());
			pst.setString(2, question.getOption1());
			pst.setString(3, question.getOption2());
			pst.setString(4, question.getOption3());
			pst.setString(5, question.getOption4());
			pst.setString(6, question.getCorrectAns());
			pst.setString(7, question.getCategory().name());
			pst.setString(8, question.getComplexity().name());

			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Question> findAll() {
		List<Question> listQuestion = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(SELECT_ALL_QUESTIONS)) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int srno = rs.getInt("srno");
				String question = rs.getString("question");
				String optionA = rs.getString("optionA");
				String optionB = rs.getString("optionB");
				String optionC = rs.getString("optionC");
				String optionD = rs.getString("optionD");
				String correctAns = rs.getString("correctAns");
				String category = rs.getString("category");
				String complexity = rs.getString("complexity");
				Question q = new Question();
				q.setSrno(srno);
				q.setQuestion(question);
				q.setOption1(optionA);
				q.setOption2(optionB);
				q.setOption3(optionC);
				q.setOption4(optionD);
				q.setCorrectAns(correctAns);
				q.setComplexity(Complexity.valueOf(complexity));
				q.setType(Category.valueOf(category));
				listQuestion.add(q);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listQuestion;
	}

	public void update(Question question) {
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(UPDATE_QUESTION)) {

			pst.setString(1, question.getQuestion());
			pst.setString(2, question.getOption1());
			pst.setString(3, question.getOption2());
			pst.setString(4, question.getOption3());
			pst.setString(5, question.getOption4());
			pst.setString(6, question.getCorrectAns());
			pst.setString(7, question.getCategory().name());
			pst.setString(8, question.getComplexity().name());
			pst.setInt(9, question.getSrno());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Question findById(int id) {
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(SELECT_QUESTION);) {
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				int srno = rs.getInt("srno");
				String question = rs.getString("question");
				String optionA = rs.getString("optionA");
				String optionB = rs.getString("optionB");
				String optionC = rs.getString("optionC");
				String optionD = rs.getString("optionD");
				String correctAns = rs.getString("correctAns");
				String category = rs.getString("category");
				String complexity = rs.getString("complexity");
				Question q = new Question();
				q.setSrno(srno);
				q.setQuestion(question);
				q.setOption1(optionA);
				q.setOption2(optionB);
				q.setOption3(optionC);
				q.setOption4(optionD);
				q.setCorrectAns(correctAns);
				q.setComplexity(Complexity.valueOf(complexity));
				q.setType(Category.valueOf(category));
				return q;
			}
			System.out.println("Question with srno " + id + " not found ");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public void deleteQuestion(int srno) {
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(DELETE_Question);) {
			pst.setInt(1, srno);
			pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<Question> findByCategory(String questionByCategory) {
		List<Question> listQuestion = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(FIND_BY_CATEGORY_QUESTION)) {
			pst.setString(1, questionByCategory);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int srno = rs.getInt("srno");
				String question = rs.getString("question");
				String optionA = rs.getString("optionA");
				String optionB = rs.getString("optionB");
				String optionC = rs.getString("optionC");
				String optionD = rs.getString("optionD");
				String correctAns = rs.getString("correctAns");
				String category = rs.getString("category");
				String complexity = rs.getString("complexity");
				Question q = new Question();
				q.setSrno(srno);
				q.setQuestion(question);
				q.setOption1(optionA);
				q.setOption2(optionB);
				q.setOption3(optionC);
				q.setOption4(optionD);
				q.setCorrectAns(correctAns);
				q.setComplexity(Complexity.valueOf(complexity));
				q.setType(Category.valueOf(category));
				listQuestion.add(q);
				System.out.println(q);
				return listQuestion;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public List<Question> findByComplexity(String questionByComplexity) {
		List<Question> listQuestion = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(FIND_BY_COMPLEXITY_QUESTION)) {
			pst.setString(1, questionByComplexity);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int srno = rs.getInt("srno");
				String question = rs.getString("question");
				String optionA = rs.getString("optionA");
				String optionB = rs.getString("optionB");
				String optionC = rs.getString("optionC");
				String optionD = rs.getString("optionD");
				String correctAns = rs.getString("correctAns");
				String category = rs.getString("category");
				String complexity = rs.getString("complexity");
				Question q = new Question();
				q.setSrno(srno);
				q.setQuestion(question);
				q.setOption1(optionA);
				q.setOption2(optionB);
				q.setOption3(optionC);
				q.setOption4(optionD);
				q.setCorrectAns(correctAns);
				q.setComplexity(Complexity.valueOf(complexity));
				q.setType(Category.valueOf(category));
				listQuestion.add(q);
				return listQuestion;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
