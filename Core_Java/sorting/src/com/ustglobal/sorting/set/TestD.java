package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestD {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(12);
		t.add(12);
		
		t.add(23);
		t.add(24);
		t.add(12);

		System.out.println("------using for each-----");
		for (Object object : t) {
			System.out.println(object);
		}
		System.out.println("-----------using iterator------------");
		Iterator it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
