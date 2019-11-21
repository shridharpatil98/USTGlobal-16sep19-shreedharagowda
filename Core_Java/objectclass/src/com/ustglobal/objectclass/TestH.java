package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p=new Person(1,"ajay");
		Person p1=new Person(2, "Akash");
		Object o=p.clone();
		Person p3=(Person)o;
		p3.id=3;
		System.out.println(p);
		System.out.println("------after cloning-----------");
		System.out.println(p3);
	}
}
