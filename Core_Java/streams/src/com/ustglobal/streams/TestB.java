package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(22);
		al.add(25);
		al.add(24);
		al.add(26);
		al.add(23);
		List<Integer> l=al.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(al);
		System.out.println(l);
		long lo=al.stream().filter(i->i<25).count();
		System.out.println(l);
		Comparator<Integer> cmp=(m1,m2)->{
			if(m1>m2)
				return 1;
			else if(m1<m2)
				return -1;
			else
				return 0;
		};
		
		int lon=al.stream().filter(i->i<25).min(cmp).get();
		System.out.println(lon);
		int max=al.stream().max(cmp).get();
		System.out.println(max);
	}
}
