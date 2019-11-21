package com.ustglobal.beanobject.bean;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private int usn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
}
