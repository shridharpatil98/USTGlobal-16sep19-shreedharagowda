package com.ustglobal.singleton;

public class TestA {
	String s;

	@Override
	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		SingltonClass s=SingltonClass.getObject();
		SingltonClass s1=SingltonClass.getObject();
		SingltonClass s2=SingltonClass.getObject();
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
	}
}
