package com.ustglobal.arrays;

public class Arrays {
public static void main(String[] args) {
	int[] num=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=32;
	num[3]=40;
	num[4]=50;
	for(int i=0;i<num.length;i++)
	System.out.println(num[i]);
	System.out.println("=================================");
	for(int i:num)
		System.out.println(i);
	System.out.println("===================================");
char[] c= {'a','b','c','d'};
for(char ch:c)
	System.out.println(ch);
System.out.println("=====================");
byte[] b= {1,2,4,5,6,7};
for(byte by:b)
	System.out.println(by);
System.out.println("=========================");

boolean[] bool= {true,false,true,true,false};
for(boolean bo:bool)
	System.out.println(bo);
double[] doub= {21.45,46.4,54.45,545.2};
for(double d:doub)
	System.out.println(d);
//	System.out.println(num[5]);
String[] str= {"kumar","darshan","ram","pradeep"};
for(String s:str)
	System.out.println(s);
}
}
