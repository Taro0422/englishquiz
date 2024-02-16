package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import dao.QuizzesDAO;

public class GivingQuizListLogic {
	public List<Quiz>execute(){
		QuizzesDAO dao = new QuizzesDAO();
		List<Quiz>quizList = dao.findByRandom();
		
		for (Quiz quiz : quizList) {
			List<String> choices = Arrays.asList(quiz.getChoice_a(), quiz.getChoice_b(), quiz.getChoice_c(), quiz.getChoice_d());
			Collections.shuffle(choices);
			quiz.setChoice_a(choices.get(0));
			quiz.setChoice_b(choices.get(1));
			quiz.setChoice_c(choices.get(2));
			quiz.setChoice_d(choices.get(3));
			}
		return quizList;
	}
}
