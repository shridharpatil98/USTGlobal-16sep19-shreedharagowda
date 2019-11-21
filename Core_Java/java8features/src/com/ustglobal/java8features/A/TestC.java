package com.ustglobal.java8features.A;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestC {
public static void main(String[] args) {
	Function<Integer,Employee> f=i->{
		Employee e=new Employee(12,"arjun",24000);
		e.id=i;
		return e;
	};
	Supplier<Employee> s=()->{
		Employee e=new Employee(12,"arjun",24000);
		return e;
	};
	Consumer<Employee> c=e->{
		e.id=56;
	};
	Employee e1=f.apply(14);
	System.out.println(e1);
	Employee e2=s.get();
	System.out.println(e2);
	c.accept(e2);
	System.out.println(e2 );
}
}
