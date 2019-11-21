package com.ustglobal.accessmodifirs.pkg1;

import com.ustglobal.accessmodifirs.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Sample s=new Sample();
		Demo d=new Demo();
		/*
		 * System.out.println(" private"+d.a);cant access
		 */
		
		/*
		 * System.out.println(" default "+d.b); d.sub();
		 */
	System.out.println(" protected "+s.c);
	s.mul();
	System.out.println(" public "+d.name);
	d.div();
	}
}
