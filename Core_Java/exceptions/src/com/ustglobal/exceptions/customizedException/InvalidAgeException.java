package com.ustglobal.exceptions.customizedException;

public class InvalidAgeException extends RuntimeException {
	String msg="Below 18 not allowed";
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException(String str) {
		this.msg=str;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
