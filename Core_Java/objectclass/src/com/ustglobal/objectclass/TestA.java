package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		PenDrive p=new PenDrive();
		Mouse m=new Mouse();
		USBPortal.connect(p);
		USBPortal.connect(m);
	}
}
