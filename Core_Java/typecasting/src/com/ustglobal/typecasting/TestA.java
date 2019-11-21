package com.ustglobal.typecasting;

public class TestA {
	public static void main(String[] args) {
		byte a=10;
		int b=a;
		System.out.println("b is"+b);
		int p=20;
		double q=p;
		System.out.println("q="+q);
		System.out.println("============");
		double d=123.00;
		int c=(int)d;
		System.out.println("c="+c);
		char ch='5';
		int in=ch;
			
		System.out.println("in ="+(in-48));
		
		System.out.println("==============================================");
		Refference r=new Refference();
		r.write();
		
		Marker m=new Marker();
		m.color();
		m.write();
		Refference r1 = new Marker();//up casting
		r1.write();
		//r1.color(); can't access
		Marker m1=(Marker)r1;//down casting
		m1.write();
		m1.color();
		
	}
}
