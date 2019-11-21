package com.ustglobal.exceptions.first;

public class BMS {
	public static void main(String[] args) {
		PVR p=new PVR();
		try {
			p.book();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("booking failed BMS");
		}
	}
}
