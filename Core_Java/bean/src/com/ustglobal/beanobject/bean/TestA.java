package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Database d=new Database();
		Student s=new Student();
		s.setId(40);
		s.setName("Ram");
		s.setUsn(123);
		d.recieve(s);
	}
}
