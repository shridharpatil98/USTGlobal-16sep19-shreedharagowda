package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Employee e=new Employee(1, "Ram", 15000);
		Employee e1=new Employee(2, "kumar", 17000);
		Employee e2=new Employee(1, "Ram", 15000);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e.equals(e1));
		System.out.println("===============================");
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e.equals(e2));
	}
}
