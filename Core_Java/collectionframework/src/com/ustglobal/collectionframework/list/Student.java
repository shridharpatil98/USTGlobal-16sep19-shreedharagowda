package com.ustglobal.collectionframework.list;

public class Student {
	int usn;
	String name;
	public Student(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + "]";
	}

}
