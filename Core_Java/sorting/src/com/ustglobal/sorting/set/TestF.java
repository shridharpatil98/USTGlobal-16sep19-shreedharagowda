package com.ustglobal.sorting.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		Employee e=new Employee(1, "Ram", 1246.23);
		Employee e1=new Employee(2, "vinod", 122.23);
		Employee e2=new Employee(4, "raj", 12436.23);
		Employee e3=new Employee(3, "buddha", 12343.23);
		Employee e4=new Employee(5, "guru", 12434.23);
//		TreeSet<Employee> t=new TreeSet<Employee>();
//		t.add(e);
//		
//		t.add(e1);
//		t.add(e2);
//		t.add(e1);
//		t.add(e2);
//		t.add(e3);
//		t.add(e4);
//		System.out.println("--------using iterator--------");
//		Iterator<Employee> it=t.iterator();
//		while(it.hasNext()) {
//			Employee o=it.next();
//			System.out.println(o);
//		}
		System.out.println("-------sort by name------");
		SortByName sn=new SortByName();
		TreeSet<Employee> t1=new TreeSet<Employee>(sn);
		t1.add(e1);
		t1.add(e2);
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println("--------using iterator--------");
		Iterator<Employee> it=t1.iterator();
		while(it.hasNext()) {
			Employee o=it.next();
			System.out.println(o);
		}
	}
}
