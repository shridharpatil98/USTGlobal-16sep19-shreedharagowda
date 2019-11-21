package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
public static void main(String[] args) {
	TreeSet<String> t=new TreeSet<String>();
	t.add("byte");
	t.add("int");
	t.add("short");
	t.add("long");
	t.add("char");
	
	System.out.println("-------using for each----------------");  
	for (String string : t) {
		System.out.println(string);
	}
	System.out.println("---------------using iterator----------");
	Iterator<String> it=t.iterator();
	while(it.hasNext())
		System.out.println(it.next());
}
}
