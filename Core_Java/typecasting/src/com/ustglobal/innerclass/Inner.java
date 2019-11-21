package com.ustglobal.innerclass;

public class Inner {
	int num;
	public Inner(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
		System.out.println("Inner class");
	}
	class InnerSide{
		InnerSide(){
			System.out.println("InnerSide class");
		}
	}
}
