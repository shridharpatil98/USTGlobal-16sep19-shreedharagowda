package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add("byte");
		s.add("short");
		s.add("int");
		s.add("long");
		System.out.println("using for each");
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println("using iterator---------------");
		Iterator<String> it=s.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
