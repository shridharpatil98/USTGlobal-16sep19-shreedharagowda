package com.ustglobal.exceptions.second;

import java.io.IOException;

public class TestB {
public static void main(String[] args) {
	System.out.println("main started");
	FileTest f=new FileTest();
	try {
		f.open();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	System.out.println("main ended");
}
}
