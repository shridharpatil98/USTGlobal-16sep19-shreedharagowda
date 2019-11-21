package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Product p=new Product(1, "Computer", "System", 4654, "lenovo");
		Product p1=new Product(1, "Computer", "System", 4654, "lenovo");
		System.out.println(p.hashCode());
		
	}
}
