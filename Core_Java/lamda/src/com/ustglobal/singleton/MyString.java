package com.ustglobal.singleton;

public final class MyString {
	private final int usn;
	private final String name;
	public MyString(int a,String s) {
		usn=a;
		name=s;
	}
	public int getUsn() {
		return usn;
	}
	public String getName() {
		return name;
	}
	public MyString changeContent(int a,String name) {
		return new MyString(a, name);
	}
}
