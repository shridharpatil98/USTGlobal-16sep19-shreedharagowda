package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {
		Student s=new Student(1, "suraj", 54.6);
		Student s1=new Student(2, "kumar", 74.6);
		Student s2=new Student(3, "raj", 64.6);
		Student s3=new Student(4, "ram", 74.6);
		Student s4=new Student(5, "murali", 24.6);

		Student[] st=new Student[5];
		st[0]=s;
		st[1]=s1;
		st[2]=s2;
		st[3]=s3;
		st[4]=s4;

		for(Student stu:st)
			System.out.println(stu);
		System.out.println("======================");
		recieve(st);

	}
	static void recieve(Student[] st) {
		for(Student s:st)
			System.out.println(s);
	}
}
