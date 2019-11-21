package com.ustglobal.thread.properties;

public class MyThread extends Thread {
	public static void main(String[] args) {
		System.out.println("main started");

		//	System.out.println(10/0);
		Thread.currentThread().setName("Ram");
		System.out.println(Thread.currentThread().getName());
		System.out.println("main ended");
	}
}
