package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(21.2);
		lh.add(21.2);
		lh.add(null);
		lh.add(null);
		lh.add("string");
		System.out.println(lh);
		System.out.println("--- using foreach-----");
		for (Object o : lh) {
			System.out.println(o);
		}
		System.out.println("-------using Iterator-------");
		Iterator it=lh.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
