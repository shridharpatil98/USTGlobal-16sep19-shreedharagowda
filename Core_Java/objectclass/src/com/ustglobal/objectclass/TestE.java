package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Cow c=new Cow(1, "ganga", 120455);
		Cow c1=new Cow(2, "gowri", 45555);
		Cow c2=new Cow(1,"ganga",120455);
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c2));
	}
}
