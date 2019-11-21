package com.ustglobal.objectclass;

public class TestC {
	public static void main(String[] args) {
		Student s=new Student(123, "Ram", 75.55);
		System.out.println("id="+s.hashCode());
		System.out.println("student="+s);
	}
}
