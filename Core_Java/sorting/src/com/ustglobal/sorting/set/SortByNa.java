package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByNa implements Comparator<Customer> {
	public int compare(Customer o1, Customer o2) {
		String s=o1.name.toLowerCase();
		String s1=o2.name.toLowerCase();
		return s.compareTo(s1);
	};
}
