package com.ustglobal.studentapp.qspider;

import com.ustglobal.studentapp.jspider.Angular;
import com.ustglobal.studentapp.jspider.React;

public class TestA {
	public static void main(String[] args) {
		QTP q=new QTP();
		q.teachQTP();
		Selenium s=new Selenium();
		s.teachSelenium();
		Angular a=new Angular();
		a.teachAngular();
		React r=new React();
		r.teachReact();
	}
}
