package com.ustglobal.assignment.student;

public class Student {
	int usn;
	String name;
	String branch;
	public Student(int usn, String name, String branch) {
		super();
		this.usn = usn;
		this.name = name;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", branch=" + branch + "]";
	}

}
