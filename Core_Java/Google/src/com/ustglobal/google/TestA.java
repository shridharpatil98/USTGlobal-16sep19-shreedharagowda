package com.ustglobal.google;

public class TestA {
	public static void main(String[] args) {
		Browser b=new Browser();
		Google g=new Gmail();
		b.open(g);
		System.out.println("==========================");
		Google d=new GoogleDrive();
		b.open(d);		 
	}
}
