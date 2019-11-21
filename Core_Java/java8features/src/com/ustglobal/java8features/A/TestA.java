package com.ustglobal.java8features.A;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Employee> p=i->{
			if(i.sal>10000)
				return true;
			else 
				return false;
		};
		 
		Employee e=new Employee(12, "Ram", 120000.25);
		System.out.println("salary greater than 10k="+p.test(e));
	}
}
