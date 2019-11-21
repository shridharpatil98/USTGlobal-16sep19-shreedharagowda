package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.add(2);
		s.add(3);
		s.add(34);
		s.push(23);
		s.push(12);
		System.out.println("-----using get-----");
		for (int i=0;i<s.size();i++)
			System.out.println(s.get(i));
		System.out.println("-----using pop----");
		int j=s.size();
		for(int i=0;i<j;i++)
			System.out.println(s.pop());
		System.out.println("---elements--"+s);
	}
}
