package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		EmpDB d=new EmpDB();
		Employee e=new Employee();
		e.setAddr("tumkur");
		e.setDept("Admin");
		e.setDesignation("Software Engineer");
		e.setEmail("ram@gmail.com");
		e.setName("Ram");
		e.setSal(900.23);
		d.recieve(e);
	}
}
