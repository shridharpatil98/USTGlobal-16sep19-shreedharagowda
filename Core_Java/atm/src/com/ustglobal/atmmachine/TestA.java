package com.ustglobal.atmmachine;

public class TestA {
	public static void main(String[] args) {
		AtmMachine at=new AtmMachine();
		SBI s=new SBI();
		at.slot(s);
		System.out.println("========================");
		HDFC h=new HDFC();
		at.slot(h);
	}
}
