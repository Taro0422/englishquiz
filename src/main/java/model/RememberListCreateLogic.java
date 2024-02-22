package model;

import java.util.List;

import dao.QuizResultDAO;

public class RememberListCreateLogic {
	public List<Remember> execute(Account userId){
		QuizResultDAO dao = new QuizResultDAO();
		List<Remember>rememberList = dao.findQuestion(userId);
		return rememberList;
	}
	
}
