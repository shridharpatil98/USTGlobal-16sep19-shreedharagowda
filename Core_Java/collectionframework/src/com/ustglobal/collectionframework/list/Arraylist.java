package com.ustglobal.collectionframework.list;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("Bangalore");
		al.add(null);
		al.add('A');
		Object ob=new Object();

		for(int i=0;i<5;i++) {
			ob=al.get(i);
			System.out.println(ob);
		}
		
	}
}
