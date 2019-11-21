package com.ustglobal.beanobject.bean;

public class EmpDB {
	void recieve(Employee e) {
		System.out.println("employee id="+e.getId());
		System.out.println("Employee name="+e.getName());
		System.out.println("Employee salary="+e.getSal());
		System.out.println("Employee dept="+e.getDept());
		System.out.println("Employee designation="+e.getDesignation());
		System.out.println("Employee doj="+e.getDoj());
		System.out.println("Employee dob="+e.getDob());
		System.out.println("Employee address="+e.getAddr());
		System.out.println("Employee email="+e.getEmail());
	}
}
