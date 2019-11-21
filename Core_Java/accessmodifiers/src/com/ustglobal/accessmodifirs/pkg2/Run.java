package com.ustglobal.accessmodifirs.pkg2;

public class Run {
public static void main(String[] args) {
	Demo d=new Demo();
		/*
		 * System.out.println(" private"+d.a);cant access
		 */
	System.out.println(" default "+d.b);
	d.sub();
	System.out.println(" protected "+d.c);
	d.mul();
	System.out.println(" public "+d.name);
	d.div();
}
}
