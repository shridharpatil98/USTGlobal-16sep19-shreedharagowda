package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(12);
		li.add("hello");
		li.add(56.25);
		li.add(true);
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println("=========================");
		for (Object object : li) {
			System.out.println(object);
		}
		System.out.println("==========================");
		ListIterator it=li.listIterator();
		while (it.hasNext()) {
			Object ob = it.next();
			System.out.println(it.next());
		}
		
	}
}
