package com.in28minutes.jee;

public class UserValidation {
	public boolean isUserValid(String user, String password)
	{
		if(user.equals("Hemanth") && password.equals("Sai"))
			return true;
		return false;
	}

}

