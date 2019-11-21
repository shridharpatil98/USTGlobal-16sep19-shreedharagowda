package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] num= {10,20,30,44};
		recieve(num);
		int[] values=getArray();
		for(int n:values)
			System.out.println(n);
		String[] str= {"nn","dsd","sds"};
		setString(str);
		String[] st=getString();
		for(String s:st)
			System.out.println(s);


	}
	static String[] getString() {
		String[] str= {"sdfs","sdfsf","sdfdsf"};
		return str;
	}
	static void setString(String ar[]) {
		for(String s:ar)
			System.out.println(s);
	}
	static void recieve(int[] nums) {
		for(int n:nums)
			System.out.println(n);
	}
	static int[] getArray() {
		int[] val= {1,2,3,4,5};
		return val;
	}
}
