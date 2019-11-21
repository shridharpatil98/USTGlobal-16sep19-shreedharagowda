package com.ustglobal.objectclass;

public class TestD {
public static void main(String[] args) {
	Car c=new Car(120000, "BMW", "white");
	Car c2=new Car(450000, "Benz", "black");
	Car c3=new Car(65541, "Audi", "red");
	System.out.println(c.hashCode());
	System.out.println(c);
	System.out.println("---------------------------");
	System.out.println(c2.hashCode());
	System.out.println(c2);
	System.out.println("----------------------------");
	System.out.println(c3.hashCode());
	System.out.println(c3);
	
}
}
