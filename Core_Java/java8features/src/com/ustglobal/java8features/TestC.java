package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestC {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();

		al.add(new Student(12, "roberrt", 25.5));
		al.add(new Student(13, "odeya", 35.5));
		al.add(new Student(14, "saho", 55.5));
		al.add(new Student(15, "kurukshetra", 15.5));
		al.add(new Student(16, "yajamana", 55.5));
		al.add(new Student(17, "roberrt", 95.5));
		Helper h=new Helper();
		h.displayAllStudent(al);
		System.out.println("-----fail students------");
		h.displayFailStudents(al);
		System.out.println("----pass students------");
		h.displayPasStudents(al);
		System.out.println("----toper-------");
		h.displayTopperStudent(al);
		System.out.println("-------sorted----");
		h.displaySortedStudent(al);
	}
}
