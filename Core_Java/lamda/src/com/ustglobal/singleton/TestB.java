package com.ustglobal.singleton;

public class TestB {
	public static void main(String[] args) {
		MyString m=new MyString(12, "name");
		MyString m1=m.changeContent(5, "name2");
		System.out.println(m.getName());
		System.out.println(m1.getName());
	}
}
