package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		Employee e=new Employee(12, "Ram", 20000.25);
		Employee e1=new Employee(13, "Ravan", 22000.25);
		Employee e2=new Employee(15, "Raj", 23000.25);
		Employee e3=new Employee(14, "bheem", 24000.25);
		Employee e4=new Employee(17, "sham", 26000.25);
		Employee e5=new Employee(16, "guru", 28000.25);
		Employee e6=new Employee(19, "rahul", 24000.25);
		Employee e7=new Employee(18, "virat", 27000.25);
		Employee e8=new Employee(20, "roberrt", 28000.25);
		Employee e9=new Employee(22, "raaa", 277000.25);

		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1=new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		al1.add(e7);

		ArrayList<Employee> al2=new ArrayList<Employee>();
		al2.add(e8);
		al2.add(e9);

		HashMap<String, ArrayList<Employee>> hm=new HashMap<>();
		hm.put("nishad", al);
		hm.put("amar", al1);
		hm.put("vinod", al2);
		
		Iterator<Employee> em=hm.get("nishad").iterator();
		
		while(em.hasNext())
			System.out.println("nishad="+em.next());
		
		Iterator<Employee> em1=hm.get("amar").iterator();
		while(em1.hasNext())
			System.out.println("Amar="+em1.next());
		
		
	}
}
