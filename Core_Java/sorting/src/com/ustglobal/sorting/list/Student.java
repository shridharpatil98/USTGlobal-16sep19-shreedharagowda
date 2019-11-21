package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	int usn;
	String name;
	double perc;
	public Student(int usn, String name, double perc) {
		super();
		this.usn = usn;
		this.name = name;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", perc=" + perc + "]";
	}
	@Override 
	public int compareTo(Student o) {
		String a=this.name.toLowerCase();
		String b=o.name.toLowerCase();
		return (a.compareTo(b));
			
		}
}
