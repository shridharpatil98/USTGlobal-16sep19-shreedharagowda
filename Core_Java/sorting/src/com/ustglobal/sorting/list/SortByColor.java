package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker> {
	@Override
	public int compare(Marker o1, Marker o2) {
		String s1=o1.color.toLowerCase();
		String s2=o2.color.toLowerCase();
		return s1.compareTo(s2);

	}
}
