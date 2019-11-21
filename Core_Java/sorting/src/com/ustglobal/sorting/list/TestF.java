package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestF {
public static void main(String[] args) {
	ArrayList<Marker> m=new ArrayList<Marker>();
	Marker m1=new Marker(21.4, "red");
	Marker m2=new Marker(214.2, "black");
	Marker m3=new Marker(222.3, "blue");
	Marker m4=new Marker(41.3, "red");
	Marker m5=new Marker(29.7, "black");
	m.add(m1);
	m.add(m2);
	m.add(m3);
	m.add(m4);
	m.add(m5);
	FortByPrice sb=new FortByPrice();
	Collections.sort(m,sb);
	System.out.println(m);
	System.out.println("------------------------------------");
	SortByColor sc=new SortByColor();
	Collections.sort(m,sc);
	System.out.println(m);
	
	
}
}
