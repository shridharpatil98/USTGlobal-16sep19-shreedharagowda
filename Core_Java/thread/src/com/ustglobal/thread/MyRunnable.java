package com.ustglobal.thread;

public class MyRunnable extends Thread implements Runnable {
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Runnable thread"+i);
	}
}
