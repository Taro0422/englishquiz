package model;

import java.io.Serializable;

public class Account implements Serializable {
	private String userId;
	private String pass;
	private String name;
	private String mail;
	public Account(String userId, String pass, String name, String mail) {
		super();
		this.userId = userId;
		this.pass = pass;
		this.name = name;
		this.mail = mail;
	}
	public String getUserId() {
		return userId;
	}
	public String getPass() {
		return pass;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
}
