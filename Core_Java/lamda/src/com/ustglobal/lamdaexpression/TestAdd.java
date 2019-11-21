package com.ustglobal.lamdaexpression;

public class TestAdd implements AddInterface {
	public static void main(String[] args) {
		TestAdd t=new TestAdd();
		System.out.println(" "+t.add(4, 4));
	}
	@Override
	public int add(int a, int b) {
			return a+b;	
	}
}
