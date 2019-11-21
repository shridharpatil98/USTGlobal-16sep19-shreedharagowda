package com.ustglobal.lamdaexpression;

public class TestMsg {
	public static void main(String[] args) {
		Message m=(msg)->{System.out.println("hi");
		System.out.println(msg);
		};
		m.greet("Bangalore");
		SayHi s=() -> System.out.println("hi");
		Square sq=(x) -> x*x;
		System.out.println(sq.square(20));
	}
}
