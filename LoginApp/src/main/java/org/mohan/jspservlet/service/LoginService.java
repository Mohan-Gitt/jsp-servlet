package org.mohan.jspservlet.service;

public class LoginService {
	
	public boolean authenticate(String userId, String password) {
		
		if(password != null ) {
			return true;
		}
		return false;
	}

}
