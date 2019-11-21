package com.ustglobal.exceptions.first;

public class TestF {
public static void main(String[] args) {
	System.out.println("main Started");
	PayTM p=new PayTM();
	try {
	p.book();
	}catch(ArithmeticException ae) {
		System.out.println("booking failed");
	}finally {
		System.out.println("finally()");
	}
	System.out.println("main ended");
}
}
