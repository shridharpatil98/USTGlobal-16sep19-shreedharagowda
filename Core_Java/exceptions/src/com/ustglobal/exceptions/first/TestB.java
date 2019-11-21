package com.ustglobal.exceptions.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		int a=10;
		int b=0;
		int[] ar= {1,2,4};
		try {
			System.out.println(ar[5]);
			b=10/0;
			System.out.println("hello");
			System.out.println("welcome");
		}
		catch (ArithmeticException e) {
			System.out.println("number divided by zero");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
		System.out.println(b);
		System.out.println(ar[2]);
	}
}
 