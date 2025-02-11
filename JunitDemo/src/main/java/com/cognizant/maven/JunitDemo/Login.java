package com.cognizant.maven.JunitDemo;

public class Login {

	private String user;
	private String password;

	public Login(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public boolean validate() {
		if (user.equals("admin") && password.equals("admin")) {
			return true;
		}
		return false;
	}
}
