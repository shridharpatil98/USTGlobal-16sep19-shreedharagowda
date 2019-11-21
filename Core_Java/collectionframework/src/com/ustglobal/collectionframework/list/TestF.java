package com.ustglobal.collectionframework.list;

import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestF {
	public static void main(String[] args) {
		Stack v=new Stack();
		v.add(45);
		v.add("hii");
		v.add(null);
		v.add(true);
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("=============================");
		for (Object object : v) {
			System.out.println(object);
		}
		System.out.println("==========================");
		ListIterator li=v.listIterator();
		while (li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);

		}
	}

}
