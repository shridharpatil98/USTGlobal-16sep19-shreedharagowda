package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(10);
		al.add(5);
		System.out.println("-------------");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("-------------------------------");
		LinkedList<Student> ll=new LinkedList<Student>();
		Student s=new Student(17, "Ram", 12.12);
		Student s1=new Student(13, "kumar", 12.12);
		Student s2=new Student(18, "Vinod", 12.12);
		Student s3=new Student(15, "toy", 12.12);
		Student s4=new Student(16, "Robertt", 12.12);
		ll.add(s);
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.add(s4);
		Iterator<Student> it=ll.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		Collections.sort(ll);
		System.out.println(ll);


	}
}
