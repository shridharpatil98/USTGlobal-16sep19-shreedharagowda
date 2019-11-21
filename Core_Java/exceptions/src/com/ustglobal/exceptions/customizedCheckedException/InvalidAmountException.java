package com.ustglobal.exceptions.customizedCheckedException;

public class InvalidAmountException extends Exception {
	private String msg="daily limit is 4000";
	@Override
	public String getMessage() {
		return msg;
	}
}
