package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.Quiz;
import model.Remember;

public class QuizResultDAO {
	private final String JDBC_URL = "jdbc:h2:~/englishquiz";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public boolean remember(String userId, int quiz_Id) {
		Account account = new Account(userId);
	    Quiz quiz = new Quiz(quiz_Id);
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "INSERT INTO RESULTS VALUES(?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,account.getUserId());
			pStmt.setInt(2,quiz.getQuiz_Id());
			int outcome = pStmt.executeUpdate();
			if(outcome !=1) {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			}
		return true;
	}
	
	public List<Remember>findQuestion(Account account){
		List<Remember>rememberList = new ArrayList<>();
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "SELECT r.USER_ID,r.QUIZ_ID, q.QUESTION, q.ANSWER, q.EXPLANATION FROM RESULTS AS r INNER JOIN QUIZZES AS q ON r.QUIZ_ID = q.QUIZ_ID WHERE USER_ID = ?;";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,account.getUserId());
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				String userId =rs.getString("USER_ID");
				int quiz_Id =rs.getInt("QUIZ_ID");
				String question = rs.getString("QUESTION");
				String answer = rs.getString("ANSWER");
				String explanation = rs.getString("EXPLANATION");
				Remember remember = new Remember(userId,quiz_Id,question,answer,explanation);
				rememberList.add(remember);
			}
			
		}catch(SQLException e) {
		 e.printStackTrace();
		 return null;
		}
	return rememberList;	
	}
	
	public boolean delete(String userId, int quiz_Id) {
		Account account = new Account(userId);
	    Quiz quiz = new Quiz(quiz_Id);
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "DELETE FROM RESULTS WHERE USER_ID =? AND QUIZ_ID = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,account.getUserId());
			pStmt.setInt(2,quiz.getQuiz_Id());
			int result = pStmt.executeUpdate();
			if(result !=1) {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			}
		return true;
	}
	
	
	
}
