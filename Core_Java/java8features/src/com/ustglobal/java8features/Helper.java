package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	void displayFailStudents(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(i -> i.perc<35).collect(Collectors.toList());
		System.out.println(l);
	}
	void displayPasStudents(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(i -> i.perc>35).collect(Collectors.toList());
		System.out.println(l);
	}

	void displayTopperStudent(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(i -> i.perc>35).collect(Collectors.toList());
		Comparator<Student> cmp=(m1,m2)->{
			if(m1.perc>m2.perc)	
				return 1;
			else if(m1.perc<m2.perc)
				return -1;
			else 
				return 0;
		};
		al.stream().max(cmp);
		System.out.println(al.stream().max(cmp));
	}
	void displaySortedStudent(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(i -> i.perc>35).collect(Collectors.toList());
		Comparator<Student> cmp=(m1,m2)->{
			if(m1.perc>m2.perc)	
				return 1;
			else if(m1.perc<m2.perc)
				return -1;
			else 
				return 0;
		};
		List<Student> ll=al.stream().sorted(cmp).collect(Collectors.toList());
		System.out.println(ll);
	}
}
