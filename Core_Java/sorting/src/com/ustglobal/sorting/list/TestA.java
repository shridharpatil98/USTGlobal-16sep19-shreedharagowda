package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestA {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(3);
		ll.add(34);
		ll.add(23);
		ll.add(12);
		System.out.println("before sorting");
		System.out.println(ll);
		System.out.println("after sort");
		Collections.sort(ll);
		System.out.println("after reverse");
		Collections.reverse(ll);
		System.out.println(ll);
		System.out.println("suffle");
		Collections.shuffle(ll);
		System.out.println(ll);
		
		
	}
}
