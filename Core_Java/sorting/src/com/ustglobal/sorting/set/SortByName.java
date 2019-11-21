package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		String s=o1.name.toLowerCase();
		String s1=o2.name.toLowerCase();
		return s.compareTo(s1);
	};
}
