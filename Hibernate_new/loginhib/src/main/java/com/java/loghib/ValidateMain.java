package com.java.loghib;

public class ValidateMain {
	public static void main(String[] args) {
		Login log = new Login();
		log.setUserName("ananya");
		log.setPassCode("ananya");
		long count = new LoginDAOImpl().loginValidate(log);
		if(count==1) {
			System.out.println("correct");
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	}


