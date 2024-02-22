package model;

import java.io.Serializable;

public class Remember implements Serializable {
	private String userId;
	private int quiz_Id;
	private String question;
	private String answer;
	private String explanation;
	
	public Remember(String userId, int quiz_Id, String question, String answer, String explanation) {
		this.userId = userId;
		this.quiz_Id = quiz_Id;
		this.question = question;
		this.answer = answer;
		this.explanation = explanation;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getQuiz_Id() {
		return quiz_Id;
	}

	public void setQuiz_Id(int quiz_Id) {
		this.quiz_Id = quiz_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
	
}
