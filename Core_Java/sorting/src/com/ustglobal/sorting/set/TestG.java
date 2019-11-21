package com.ustglobal.sorting.set;

import java.util.TreeSet;

public class TestG {
public static void main(String[] args) {
	Customer c=new Customer("Ram", 12, 123.25);
	Customer c1=new Customer("vinod", 13, 1223.25);
	Customer c2=new Customer("buddha", 14, 144.25);
	Customer c3=new Customer("shiva", 11, 1233.25);
	Customer c4=new Customer("krishna", 16, 12223.25);
	SortByNa sb=new SortByNa();
	TreeSet<Customer> t=new TreeSet<Customer>(sb);
	t.add(c1);
	t.add(c2);
	t.add(c3);
	t.add(c3);
	t.add(c);
	
	System.out.println(t);
}
}
