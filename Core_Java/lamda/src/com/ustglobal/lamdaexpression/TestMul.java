package com.ustglobal.lamdaexpression;

public class TestMul {
	public static void main(String[] args) {
		MultiplyInterface mul=(a,b)->a*b;
		System.out.println(" "+mul.mul(4, 5));
	}
}
