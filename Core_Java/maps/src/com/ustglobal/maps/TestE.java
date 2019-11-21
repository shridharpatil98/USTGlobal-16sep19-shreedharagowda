package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class TestE {
public static void main(String[] args) {
	Student s=new Student(12, "Ram", 85.23);
	Student s1=new Student(13, "Raj", 55.23);
	Student s2=new Student(1, "Bheem", 65.23);
	Student s3=new Student(2, "Ravana", 75.23);
	Student s4=new Student(14, "Dhuryodhana", 95.23);
	Student s5=new Student(4, "krishna", 75.23);
	Student s6=new Student(5, "arjuna", 85.23);
	Student s7=new Student(6, "nakul", 55.23);
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s);
	al.add(s1);
	al.add(s2);
	
	ArrayList<Student> al1=new ArrayList<Student>();
	al1.add(s3);
	al1.add(s4);
	al1.add(s5);
	
	ArrayList<Student> al2=new ArrayList<Student>();
	al2.add(s5);
	al2.add(s6);
	al.add(s7);
	
	
	HashMap<String, ArrayList<Student>> hm=new HashMap<>();
	hm.put("first",al);
	hm.put("second",al1);
	hm.put("third",al2);
	
	System.out.println(hm.get("second"));
	
	
}
}
