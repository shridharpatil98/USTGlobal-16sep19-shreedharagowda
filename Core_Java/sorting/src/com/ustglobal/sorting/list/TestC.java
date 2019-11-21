package com.ustglobal.sorting.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestC {
	static void displayDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		Laptop l=new Laptop("HP", 2, 2000);
		Laptop l1=new Laptop("Lenovo", 2, 2000);
		Laptop l2=new Laptop("Asus", 4, 40000);
		Laptop l3=new Laptop("Dell", 2, 2000);
		Laptop l4=new Laptop("HP", 4, 40000);
		Laptop l5=new Laptop("Lenovo", 2, 2000);
		LinkedList<Laptop> ll=new LinkedList<Laptop>();
		ll.add(l);
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(l5);

		System.out.println("before sorting");
		displayDetails(ll);
		System.out.println("after sorting");
		Collections.sort(ll);
		displayDetails(ll);
		System.out.println("------------------------------");
		System.out.println(ll.peek());
		System.out.println("peek first "+ll.peekFirst());
		System.out.println("peek last "+ll.peekLast());
		System.out.println(" poll "+ll.poll());
		System.out.println(" poll first "+ll.pollFirst());
		System.out.println(" poll last"+ll.pollLast());
		System.out.println(ll);
		ll.push(l5);
		System.out.println("push--"+ll);
		System.out.println("pop----"+ll.pop());

	}
}
