package com.ustglobal.assignment.studentlist;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainClass {
public static void main(String[] args) {
	StudentList s=new StudentList(12, "Ram", "cse");
	StudentList s1=new StudentList(13, "Raj", "ece");
	StudentList s2=new StudentList(14, "Kumar", "ise");
	StudentList s3=new StudentList(15, "Sham", "cse");
	StudentList s4=new StudentList(16, "Vinod", "cse");
	System.out.println("---------Student ArrayList using forach------");
	ArrayList<StudentList> st=new ArrayList<StudentList>();
	st.add(s);
	st.add(s1);
	st.add(s2);
	st.add(s3);
	st.add(s4);
	for (StudentList studentList : st) {
		System.out.println(studentList);
	}
	System.out.println("----------Student ArrayList Iterator for-----------");
	ListIterator<StudentList> li=st.listIterator();
	for (int i = 0; i < st.size(); i++) {
		System.out.println(li.next());
	}
	System.out.println("----------------Employee--------------------------");
	Employee e=new Employee(1, "Ram", 40000.23);
	Employee e1=new Employee(2, "Madhu", 50000.23);
	Employee e2=new Employee(3, "Raj", 30000.23);
	Employee e3=new Employee(4, "pavan", 40000.23);
	Employee e4=new Employee(5, "suraj", 70000.23);
	
	ArrayList<Employee> el=new ArrayList<Employee>();
	el.add(e);
	el.add(e1);
	el.add(e2);
	el.add(e3);
	el.add(e4);
	System.out.println("------------------Employee ArrayList using while----------");
	ListIterator<Employee> ei=el.listIterator();
	while (ei.hasNext()) {
		System.out.println(ei.next());
	}
	System.out.println("--------Employee ArrayList backward---------");
	while(ei.hasPrevious())
		System.out.println(ei.previous());
	
}
}
