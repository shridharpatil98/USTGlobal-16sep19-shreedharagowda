package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(12);
		h.add(12);
		h.add(44.23);
		h.add(34);
		h.add("sda");
		h.add(null);
		System.out.println("-----for each------");
		for (Object object : h) {
			System.out.println(object);
		}
		System.out.println("-----iterator-----------");
		Iterator it=h.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("--------------------");
	}
}
