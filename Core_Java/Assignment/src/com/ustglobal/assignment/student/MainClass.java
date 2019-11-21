package com.ustglobal.assignment.student;

public class MainClass {
	public static void main(String[] args) {
		Student s=new Student(12, "Ram", "cse");
		Student s1=new Student(13, "Raj", "ece");
		Student s2=new Student(14, "Kumar", "ise");
		Student s3=new Student(15, "Sham", "cse");
		Student s4=new Student(16, "Vinod", "cse");
		Student[] st= {s1,s2,s3,s4,s};
		System.out.println("-----Student using for-------------");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		System.out.println("----------Student using for each-----------------");
		for (Student student : st) {
			System.out.println(student);
		}

	}
}
