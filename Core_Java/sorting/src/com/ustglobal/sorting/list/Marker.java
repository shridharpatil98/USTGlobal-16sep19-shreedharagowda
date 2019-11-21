package com.ustglobal.sorting.list;

public class Marker {
	@Override
	public String toString() {
		return "Marker [price=" + price + ", color=" + color + "]";
	}
	double price;
	String color;
//	public Marker(double price, String color) {
//		
//	}
	public Marker(double price2, String color2) {
		// TODO Auto-generated constructor stub
		super();
		this.price = price2;
		this.color = color2;
	}

}
