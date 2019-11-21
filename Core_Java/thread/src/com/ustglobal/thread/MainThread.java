package com.ustglobal.thread;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("Main Started");

		MyThread t1=new MyThread();
		t1.start();

		for(int i=0;i<10;i++)
			System.out.println("main thread"+i);
		System.out.println("----------------------------------");
		MyRunnable run=new MyRunnable();
		
		Thread t2=new Thread(run);
		t2.start();

		System.out.println("main ended");
	}
}
