package com.ustglobal.exceptions.first;

public class PVR {
public void book() throws ArithmeticException{
	try {
		int a=10/0;
		System.out.println("book confirm");
	}catch (ArithmeticException e) {
		System.out.println("booking failed");
//		throw e;
	}
}
}
