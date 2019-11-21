package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestH {
public static void main(String[] args) {
	PriorityQueue<Integer> p=new PriorityQueue<Integer>();
	p.add(12);
	p.add(11);
	p.add(12);
	p.add(13);
	p.add(143);
	p.add(123);
	p.add(1235);
	System.out.println("before poll---"+p);
	System.out.println("--------poll using iterator-------");
	Iterator<Integer> it=p.iterator();
	while(it.hasNext())
		System.out.println(p.poll());
	
}
}
