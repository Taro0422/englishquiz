package test;

import dao.AccountsDAO;
import model.Account;
import model.Login;

public class AccountsDAOTest {
	public static void main(String[] args) {
		testFindByLoginOK();
		testFindByLoginNG();
	}
	public static void testFindByLoginOK() {
		Login login = new Login ("test","a1b2c3");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		if(result != null && result.getUserId().equals("test")&& result.getPass().equals("a1b2c3")&& result.getName().equals("テストタロウ")&& result.getMail().equals("test@co.jp")){
			System.out.println("成功しました");
		}else {
			System.out.println("失敗しました");
		}
	}
	public static void testFindByLoginNG() {
		Login login = new Login("test","a1b1c1");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		if(result ==null) {
			System.out.println("成功しました");
		}else {
			System.out.println("失敗しました");
		}
	}
}
