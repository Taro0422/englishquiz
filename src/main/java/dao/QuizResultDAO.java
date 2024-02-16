package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Account;
import model.Quiz;

public class QuizResultDAO {
	private final String JDBC_URL = "jdbc:h2:~/englishquiz";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public boolean remember(Account account,Quiz quiz) {
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
}
