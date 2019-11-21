package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {
		Pen p=new Pen(21.5, "cello", "red");
		Pen p1=new Pen(23.5, "bright", "blue");
		Pen p2=new Pen(215.25, "cello", "red");
		Pen p3=new Pen(231.5, "cello", "green");
		LinkedList<Pen> l=new LinkedList<Pen>();
		l.add(p);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		System.out.println("--------------before sorting----------");
		Iterator<Pen> it=l.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("------after Sorting-------------");
		Collections.sort(l);
		System.out.println(l);
		
		
	}
}
