package com.ustglobal.exceptions.first;

public class PayTM {
	void book() throws ArithmeticException{
		System.out.println("Paytm Started");
		IRCTC i=new IRCTC();
		i.confirm();
		System.out.println("PayTM ended");
	}
}
