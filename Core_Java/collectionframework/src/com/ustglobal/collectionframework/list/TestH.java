package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(8);
		al.add(null);
		al.add(null);
		al.add(5);

		System.out.println(al);
		System.out.println("-----------------");
		al.add(3, 5);
		al.add(2, 5);
		System.out.println(al);
		al.remove(0);
		System.out.println("----remoe-----");
		System.out.println(al);
		al.remove(null);
		System.out.println("===============");
		System.out.println(al.toString());
		System.out.println("----------------------");
		int a=al.get(3);
		System.out.println(a);
		System.out.println("-----------------");
		al.set(2, 5);
		System.out.println(al);

		System.out.println("-------------------------");
		System.out.println(al.contains(5));
		List<Integer> li=new ArrayList<>(); 
		li.add(20);
		li.add(4);
		li.addAll(al);
		System.out.println(li.containsAll(al));
		System.out.println(li.removeAll(al));
	} 
}
