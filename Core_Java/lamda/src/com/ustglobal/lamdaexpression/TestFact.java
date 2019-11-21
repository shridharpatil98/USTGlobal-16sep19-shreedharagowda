package com.ustglobal.lamdaexpression;

public class TestFact {
public static void main(String[] args) {
	int fact=1;
	FactorialInterface fa=(f)->{
		if(f<=1)
			return fact;
		else {
			System.out.println(fact);
			return fact*(f-1);
		}
	};
	fa.fact(5);
}
}
