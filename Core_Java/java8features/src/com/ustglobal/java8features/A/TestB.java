package com.ustglobal.java8features.A;

import java.util.function.Function;

public class TestB {
	public static void main(String[] args) {
		Function<Integer, Integer> f=i-> i*i;
		System.out.println("sqrt="+f.apply(10));
	}
}
