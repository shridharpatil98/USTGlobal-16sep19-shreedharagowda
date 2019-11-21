package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Raj");
		al.add("kumar");
		al.add("23");
		al.add("Ram");
		al.add("raja");
		
		String s=al.get(2);
		System.out.println(s.toUpperCase());
		
		Iterator<String> it=al.iterator();
		for(int i=0;i<al.size();i++)
			System.out.println(it.next());
	}
}
