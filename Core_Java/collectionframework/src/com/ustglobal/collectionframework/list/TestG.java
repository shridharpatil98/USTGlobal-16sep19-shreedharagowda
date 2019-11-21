package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Student> st=new ArrayList<Student>();
		Student s=new Student(12, "hi");
		Student s1=new Student(13, "hello");
		Student s2=new Student(14, "good");
		Student s3=new Student(15, "evening");
		Student s4=new Student(16, "bye");

		st.add(s);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);


		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		System.out.println("=======================");
		for (Student student : st) {
			System.out.println(student);
		}
		System.out.println("==============================");
		ListIterator<Student> li=st.listIterator();
		while (li.hasNext()) {
			Student stu = li.next();
			System.out.println(stu);
			
		}
	}
}
