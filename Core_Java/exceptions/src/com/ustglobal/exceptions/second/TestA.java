package com.ustglobal.exceptions.second;

public class TestA {
	public static void main(String[] args) {
		try {
			Thread.sleep(200);
			System.out.println("inside thread try");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
