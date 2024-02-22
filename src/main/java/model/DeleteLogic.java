package model;

import dao.QuizResultDAO;

public class DeleteLogic {
	public void execute(String userId,int quiz_Id) {
		QuizResultDAO dao = new QuizResultDAO();
		dao.delete(userId,quiz_Id);
	}
}
