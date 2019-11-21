package com.ustglobal.exceptions.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");
		int a=10;
		int b=0;
		int[] ar= {1,2,4};
		String s="hello";
		try {
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(ar[5]);
			System.out.println("hello");
			System.out.println("welcome");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}catch (ArithmeticException e) {
			System.out.println("number divided by zero");
		}catch(NullPointerException np) {
			System.out.println("pointing to null");
		}
		System.out.println(b);
		System.out.println(ar[2]);
	}
}
