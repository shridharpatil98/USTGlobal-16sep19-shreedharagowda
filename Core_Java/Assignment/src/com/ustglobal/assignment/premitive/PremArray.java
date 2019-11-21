package com.ustglobal.assignment.premitive;

public class PremArray {
	public static void main(String[] args) {
		byte[] b= {1,2,3,4,5,6,7,8,9,2,4,7,2};
		short[] s= {1,2,4,6,2,6,3,7,2,6,8,2,5};
		int[] in= {1,3,5,7,2,6,3,6,1};
		long[] l= {4,1,6,2,5,2,43,54,324,3,54545};
		float[] fl= {12.3f,31.4f,32.43f,45.23f};
		double[] d= {23.4,32.43,432.54,5435.34,543.23};
		char[] ch= {'k','u','m','a','r'};
		boolean[] bool= {true,false,true,false,false,true};
		System.out.println("-------byte using for------------");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);	
		}
		System.out.println("-------byte using for rach------------");
		for (byte c : b) {
			System.out.println(c);
		}
		System.out.println("-------short using for------------");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);	
		}
		System.out.println("-------short using for rach------------");
		for (int c : s) {
			System.out.println(c);
		}
		System.out.println("---------int using for------------");
		for (int i = 0; i < in.length; i++) {
			System.out.println(in[i]);
		}
		System.out.println("-----------int using for each--------------");
		for (int c : in) {
			System.out.println(c);
		}System.out.println("-------long using for------------");
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);	
		}
		System.out.println("-------long using for rach------------");
		for (long c : l) {
			System.out.println(c);
		}System.out.println("-------float using for------------");
		for (int i = 0; i < fl.length; i++) {
			System.out.println(fl[i]);	
		}
		System.out.println("-------float using for rach------------");
		for (float c : fl) {
			System.out.println(c);
		}
		System.out.println("-------double using for------------");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);	
		}
		System.out.println("-------double using for rach------------");
		for (double c : d) {
			System.out.println(c);
		}System.out.println("-------char using for------------");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);	
		}
		System.out.println("-------char using for rach------------");
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("-------boolean using for------------");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);	
		}
		System.out.println("-------boolean using for rach------------");
		for (boolean c : bool) {
			System.out.println(c);
		}

	}
}
