package com.ustglobal.hasrelation;

public class TestA {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="darshan";
		p.sleep();
		System.out.println("person name="+p.name);
		System.out.println("==========================");
		p.m.write();
		p.m.color="red";
		System.out.println(" marker color="+p.m.color);
	}
}
