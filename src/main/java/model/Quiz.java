package model;

import java.io.Serializable;

public class Quiz implements Serializable{
	private int quiz_Id;
	private String question;
	private String choice_a;
	private String choice_b;
	private String choice_c;
	private String choice_d;
	private String answer;
	private String explanation;
	
	public Quiz() {}
	
	public Quiz(int quiz_Id, String question, String choice_a, String choice_b, String choice_c, String choice_d,
			String answer, String explanation) {
		super();
		this.quiz_Id = quiz_Id;
		this.question = question;
		this.choice_a = choice_a;
		this.choice_b = choice_b;
		this.choice_c = choice_c;
		this.choice_d = choice_d;
		this.answer = answer;
		this.explanation = explanation;
	}

	public int getQuiz_Id() {
		return quiz_Id;
	}

	public String getQuestion() {
		return question;
	}

	public String getChoice_a() {
		return choice_a;
	}

	public String getChoice_b() {
		return choice_b;
	}

	public String getChoice_c() {
		return choice_c;
	}

	public String getChoice_d() {
		return choice_d;
	}

	public String getAnswer() {
		return answer;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setChoice_a(String choice_a) {
		this.choice_a = choice_a;
	}

	public void setChoice_b(String choice_b) {
		this.choice_b = choice_b;
	}

	public void setChoice_c(String choice_c) {
		this.choice_c = choice_c;
	}

	public void setChoice_d(String choice_d) {
		this.choice_d = choice_d;
	}

	
	
	
}
