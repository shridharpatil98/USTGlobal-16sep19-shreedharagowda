package com.ustglobal.studentapp.qspider;
import static com.ustglobal.studentapp.jspider.Remote.num;
import static com.ustglobal.studentapp.jspider.Remote.off;
import static com.ustglobal.studentapp.jspider.Remote.on;

import com.ustglobal.studentapp.jspider.Remote;
public class TestB {
	public static void main(String[] args) {
		Remote r=new Remote();
		on();
		off();
		
		System.out.println("num ="+num+" "+r.num);
	}
}
