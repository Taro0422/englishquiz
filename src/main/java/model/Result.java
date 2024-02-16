package model;

import java.io.Serializable;

public class Result implements Serializable {
	private String userId;
	private int quizId;
	
	public Result() {}

	public Result(String userId, int quizId) {
		this.userId = userId;
		this.quizId = quizId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	
	
	
}
	
	
