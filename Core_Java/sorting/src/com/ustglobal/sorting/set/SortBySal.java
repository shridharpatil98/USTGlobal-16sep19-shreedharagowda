package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		Double i=o1.sal;
		Double i1=o2.sal;
		return i.compareTo(i1);
	}
}
