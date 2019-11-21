package com.ustglobal.exceptions.customizedCheckedException;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		try(Scanner sc=new Scanner(System.in);
				Scanner sc2=new Scanner(System.in)){
			System.out.println("enter age");
			int a=sc.nextInt();
			System.out.println(a/0);
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("finally");
		} 
	}
}
