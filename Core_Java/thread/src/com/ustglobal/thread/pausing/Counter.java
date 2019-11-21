package com.ustglobal.thread.pausing;

public class Counter {
	int v=0;
	synchronized public void increment() {
		v++;
	}
	synchronized public void decrement(){
		v--;
	}
	synchronized public void showValue() {
		System.out.println(v);
	}
}
