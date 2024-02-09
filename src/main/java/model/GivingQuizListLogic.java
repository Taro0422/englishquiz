package model;

import java.util.List;

import dao.QuizzesDAO;

public class GivingQuizListLogic {
	public List<Quiz>execute(){
		QuizzesDAO dao = new QuizzesDAO();
		List<Quiz>quizList = dao.findByRandom();
		return quizList;
	}
}
