package com.ustglobal.thread.pausing;

public class TestCounter {
	public static void main(String[] args) {
		Counter c=new Counter();
		Runnable r1=()->{
			c.increment();
			c.showValue();
		};
		Runnable r2=()->{
			c.decrement();
			c.showValue();
		};
		Thread t=new Thread(r1);
		Thread t1=new Thread(r2);
		t.start();
		t1.start();
	}
}
