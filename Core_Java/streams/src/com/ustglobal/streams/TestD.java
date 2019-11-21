package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
public static void main(String[] args) {
	Employee e=new Employee(12, "ram");
	Employee e1=new Employee(13, "bheem");
	Employee e2=new Employee(15, "kumar");
	Employee e3=new Employee(11, "sham");
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(e);
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	Comparator<Employee> cmp=(ee, eee)->{
		return ee.name.compareTo(eee.name);
	};
	List<Employee> ls=al.stream().sorted(cmp).collect(Collectors.toList());
	
	System.out.println(ls);
	
}



}
