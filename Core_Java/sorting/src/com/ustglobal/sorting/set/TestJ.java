package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
public static void main(String[] args) {
	Comparator<Employee> cp=(e1,e2)->{
		return e1.name.compareToIgnoreCase(e2.name);
	};
	TreeSet<Employee> ts=new TreeSet<Employee>(cp);
//	ts.add(new Employee(12, "Ram", 12000.22));
	ts.add(new Employee(13, "Raj", 12000.22));
	ts.add(new Employee(15, "Vinod", 45000.22));
	ts.add(new Employee(14, "buddha", 45000.22));
	ts.add(new Employee(17, "ganesha", 55000.22));
	ts.add(new Employee(16, "bheema", 23000.22));
	
	System.out.println("---------using iterator----------------");
	Iterator<Employee> it=ts.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	for (Employee employee : ts) {
		System.out.println(employee);
	}
}
}
