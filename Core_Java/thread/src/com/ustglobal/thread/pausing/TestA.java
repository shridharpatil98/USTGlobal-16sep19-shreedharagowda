package com.ustglobal.thread.pausing;

public class TestA {
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		Runnable r1=()->{
			synchronized (o1) {
				System.out.println("T1 started");
				System.out.println("t1 locked obj1");
				try {
					o1.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("t1 has locked obj2");	
				}
			}
			System.out.println("t1 finished");
		};
		Runnable r2=()->{
			synchronized (o2) {
				System.out.println("T2 started");
				System.out.println("t2 locked obj2");
				synchronized (o1) {
					System.out.println("t1 has locked obj1");
					o1.notify();
				}
			}
			System.out.println("t2 finished");
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
		System.out.println("main ended");
	}
}
