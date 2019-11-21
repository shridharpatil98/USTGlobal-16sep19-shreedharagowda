package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	String brand;
	int ram;
	double price;
	public Laptop(String brand, int ram, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	// sorting by ram
	//	@Override
	//	public int compareTo(Laptop o) {
	//		if(this.ram>o.ram)
	//			return 1;
	//		else if(this.ram<o.ram)
	//			return -1;
	//		else
	//		return 0;
	//	}
//sorting by price
//	@Override
//	public int compareTo(Laptop o) {
//		if(this.price>o.price)
//			return 1;
//		else if(this.price<o.price)
//			return -1;
//		else
//			return 0;
//	}
	// sorting by brand
	@Override
	public int compareTo(Laptop o) {
		String s=this.brand.toLowerCase();
		String s1=o.brand.toLowerCase();
		
		return s.compareTo(s1);
	}
}
