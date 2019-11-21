package com.ustglobal.wrapperclass;

public class TestA {
	public static void main(String[] args) {
		int a=10;
		System.out.println("a="+a);
		Integer i=a;//Auto Boxing
		System.out.println("i="+i);
		Integer x=20;
		System.out.println("x="+x);
		int y=x;//auto un boxing
		System.out.println("y="+y);
		int v=Integer.parseInt("1244");
	}
}
