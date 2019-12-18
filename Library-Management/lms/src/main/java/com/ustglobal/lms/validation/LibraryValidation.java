package com.ustglobal.lms.validation;

import java.util.regex.Pattern;

public class LibraryValidation {
	public static boolean email(String email) {

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
				"[a-zA-Z0-9_+&*-]+)*@" + 
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
				"A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		if(email == null) {
			return false;
		}
		return pat.matcher(email).matches();
	}
	
	public static boolean name(String name) {
		String nameRegex = "^[\\p{L} .'-]+$";
		Pattern pat = Pattern.compile(nameRegex);
		if(name == null) {
			return false;
		} else {
			return pat.matcher(name).matches();
		}
	}
	
	public static boolean password(String password) {
		String passRegex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		Pattern pat = Pattern.compile(passRegex);
		if(password == null) {
			return false;
		}else {
			return pat.matcher(password).matches();
		}
	}
}
