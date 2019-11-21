package com.ustglobal.stringclass;

public class StringClass {
	public static void main(String[] args) {

		String s="darshan";
		String s1=new String("Ram");

		String s3=new String("aishu");
		String s4=new String("darshan");
		String s5="darshan";
		System.out.println(s.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s.equals(s5));
		System.out.println("=======================");
		String s6=s1.toUpperCase();
		System.out.println(s6);
		String s7=s1.toLowerCase();
		System.out.println(s7);
		char c=s1.charAt(2);
		System.out.println(c);
		boolean b=s1.equalsIgnoreCase(s6);
		System.out.println(b);
		StringBuffer sb=new StringBuffer("string ");
		System.out.println(sb);
		sb.append("Buffer");
		System.out.println(sb);
		

	}
}
