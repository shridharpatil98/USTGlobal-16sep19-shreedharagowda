package com.ustglobal.exceptions.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("main started");
		int a=10;
		int b=0;
		int[] ar= {1,2,4};
		try {
			System.out.println(ar[5]);
			
			System.out.println("hello");
			System.out.println("welcome");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}try {
			b=10/0;
		}
		catch (ArithmeticException e) {
			System.out.println("number divided by zero");
		}
		System.out.println(b);
		System.out.println(ar[2]);
	}
}
 