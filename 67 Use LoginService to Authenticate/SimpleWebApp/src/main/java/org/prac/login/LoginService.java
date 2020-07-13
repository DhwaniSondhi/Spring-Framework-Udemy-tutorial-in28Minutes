package org.prac.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		return user.equalsIgnoreCase("Dhwani")  &&  password.equalsIgnoreCase("password");
		
	}
}
