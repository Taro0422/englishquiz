package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Quiz;

public class QuizzesDAO {
	private final String JDBC_URL = "jdbc:h2:~/englishquiz";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public List<Quiz> findByRandom() {
		List<Quiz>quizList = new ArrayList<>();
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = 
					"SELECT QUIZ_ID,QUESTION,CHOICE_A,CHOICE_B,CHOICE_C,CHOICE_D,ANSWER,EXPLANATION FROM QUIZZES ORDER BY RAND() LIMIT 10";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				int quiz_Id = rs.getInt("QUIZ_ID");
				String question = rs.getString("QUESTION");
				String choice_a = rs.getString("CHOICE_A");
				String choice_b = rs.getString("CHOICE_B");
				String choice_c = rs.getString("CHOICE_C");
				String choice_d = rs.getString("CHOICE_D");
				String answer = rs.getString("ANSWER");
				String explanation = rs.getString("EXPLANATION");
				Quiz quiz = new Quiz(quiz_Id,question,choice_a, choice_b,choice_c, choice_d,answer,explanation);
			    quizList.add(quiz);
			    }
			}catch(SQLException e) {
				e.printStackTrace();
				return null;}
		
		return quizList;
	
		}
 	}