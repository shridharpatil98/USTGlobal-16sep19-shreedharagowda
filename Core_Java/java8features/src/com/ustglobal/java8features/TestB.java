package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		Predicate<Student> p=i->{
			if(i.perc>35)
				return true;
			else
				return false;
		};
		
		Student s=new Student(12, "roberrt", 25.5);
		
		System.out.println(" student is pass= "+p.test(s));
	}
}
