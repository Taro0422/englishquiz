package test;

import model.Login;
import model.LoginLogic;

public class LoginLogicTest {

	public static void main(String[] args) {
		testExecuteOK();
		testExecuteNG();
	}
	public static void testExecuteOK() {
		Login login = new Login ("test","a1b2c3");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		if(result) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}
	}
	public static void testExecuteNG() {
		Login login = new Login ("test","a1b1c1");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		if(!result) {
			System.out.println("成功");
		}else {
			System.out.println("失敗");
		}
	}
		
}
