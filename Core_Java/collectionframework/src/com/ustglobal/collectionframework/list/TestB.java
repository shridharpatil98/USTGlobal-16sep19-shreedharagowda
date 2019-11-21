package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestB {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(21.20);
		a.add(true);
		a.add("Ram");
		a.iterator();
		for(Object o:a)
			System.out.println(o);


		Iterator it=a.iterator();
		Object o1=it.next();
		System.out.println(o1);
		Object o2=it.next();
		System.out.println(o2);
		Object o3=it.next();
		System.out.println(o3);
		Object o4=it.next();
		System.out.println(o4);
		Object o=new Object();
		//		Object o5=it.next();
		//		System.out.println(o5);
		//		No Such element Exception
		//		
		System.out.println("using for");
		for(int i=0;i<a.size();i++) {
			o=a.get(i);
			System.out.println("using while");
			Iterator ite=a.iterator();
			while(ite.hasNext()) {
				o=ite.next();
				System.out.println(o);
			}
			System.out.println("==============================");
			ListIterator li=a.listIterator();
			while(li.hasNext()) {
				o=li.next();
				System.out.println(li.next());
			}
			System.out.println("=====================================");
			while(li.hasPrevious())
				System.out.println(li.previous());
		}
		System.out.println();
	}
}
