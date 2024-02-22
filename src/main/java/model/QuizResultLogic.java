package model;

import dao.QuizResultDAO;

public class QuizResultLogic {
	public void execute(Account account,Quiz quiz) {
		QuizResultDAO dao= new QuizResultDAO();
		dao.remember(account.getUserId(), quiz.getQuiz_Id());
	}
}