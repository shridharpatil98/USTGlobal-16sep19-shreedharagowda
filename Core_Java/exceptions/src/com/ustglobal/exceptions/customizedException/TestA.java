package com.ustglobal.exceptions.customizedException;

public class TestA {
public static void main(String[] args) {
	int age=17;
	Validator v=new Validator();
	try{
		v.verify(age);
	}
	catch(InvalidAgeException a) {
		System.out.println(a);
	}
	}
}

