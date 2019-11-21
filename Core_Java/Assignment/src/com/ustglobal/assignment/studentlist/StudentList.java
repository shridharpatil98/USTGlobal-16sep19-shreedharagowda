package com.ustglobal.assignment.studentlist;

public class StudentList {
	int usn;
	String name;
	String branch;
	public StudentList(int usn, String name, String branch) {
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
