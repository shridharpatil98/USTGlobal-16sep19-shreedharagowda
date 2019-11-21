package com.ustglobal.objectclass;

public class Student {
	int id;
	String name;
	double perc;
	public Student(int id,String name,double perc) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.perc=perc;
	}
	public int hashCode() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}
	
}
