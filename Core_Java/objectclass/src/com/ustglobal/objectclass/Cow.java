package com.ustglobal.objectclass;

public class Cow {
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public boolean equals(Object obj) {
		Cow c=(Cow)obj;
		if(this.id==c.id&&this.name.equals(c.name)&&this.cost==c.cost) {
			return true;
		}
		else {
			return false;
		}
	}
}
