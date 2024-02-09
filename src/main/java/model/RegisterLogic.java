package model;

import dao.AccountsDAO;

public class RegisterLogic {
	public void execute(Account account) {
		AccountsDAO dao= new AccountsDAO();
		dao.create(account);
	}
}
