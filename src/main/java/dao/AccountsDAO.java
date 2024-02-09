package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;

public class AccountsDAO {
	private final String JDBC_URL = "jdbc:h2:~/englishquiz";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public Account findByLogin(Login login) {
		Account account = null;
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "SELECT USER_ID,PASS,NAME,MAIL FROM ACCOUNTS WHERE USER_ID = ? AND PASS = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,login.getUserId());
			pStmt.setString(2,login.getPass());
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()) {
				String userId = rs.getString("USER_ID");
				String pass = rs.getString("PASS");
				String name = rs.getString("NAME");
				String mail = rs.getString("MAIL");
				account = new Account(userId,pass,name,mail);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	return account;
	}
	
	public boolean create(Account account) {
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした");
		}
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "INSERT INTO ACCOUNTS VALUES(?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,account.getUserId());
			pStmt.setString(2,account.getPass());
			pStmt.setString(3,account.getName());
			pStmt.setString(4,account.getMail());
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
