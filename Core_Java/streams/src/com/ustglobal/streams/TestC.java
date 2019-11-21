package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(22);
		al.add(25);
		al.add(24);
		al.add(26);
		al.add(23);

		List<Integer> l=al.stream().sorted().collect(Collectors.toList());
		System.out.println(l);

	}
}
