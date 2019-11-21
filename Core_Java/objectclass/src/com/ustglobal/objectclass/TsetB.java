package com.ustglobal.objectclass;

public class TsetB {
	public static void main(String[] args) {
		Pen p=new Pen();
		Pen p1=new Pen();
		System.out.println("hash="+p1.hashCode());
		System.out.println("hashcode="+p.hashCode());
		if(p1.hashCode()==p.hashCode()) {
			System.out.println("equals");
		}else if(p1.equals(p1)) {
			System.out.println("equals");
		}
		System.out.println(p);
	}
}
