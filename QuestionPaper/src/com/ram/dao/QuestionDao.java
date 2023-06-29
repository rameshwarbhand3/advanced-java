package com.ram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.ram.model.Question;

public class QuestionDao {
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/questionPaperGeneratorDb";
	private String jdbcUser = "root";
	private String jdbcPassword = "root";

	private static final String INSERT_QUESTION_SQL = "insert into questionBank"
			+ "(SrNo,Question,optionA,optionB,optionC,OptionD,CorrectAns,Category,Complexity)values"
			+ "(null,?,?,?,?,?,?,?,?)";

	// private static final String SELECT_question_sql = "select * from questionBank
	// where srNo=?";

	// private static final String SELECT_all_question = "select * from
	// questionBank";

	// private static final String UPDATE_question_sql = "update questionBank set
	// category=? where srNo=?";

	// private static final String DELETE_question_sql = "delete from questionBank
	// where srNo=?";

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

	public void insertQuestion(Question question) {
		try (Connection connection = getConnection();
				PreparedStatement pst = connection.prepareStatement(INSERT_QUESTION_SQL)) {
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

}
