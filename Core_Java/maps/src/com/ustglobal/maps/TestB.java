package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("Ram", 1324655);
		hm.put("Kumar",23346546);
		hm.put("Raj",233544546);
		hm.put("Bheem",45346546);
		HashMap hm1=new HashMap();
		hm1.put("Ram", 1324655);
		hm1.put("Kumar",23346546);
		hm1.put("Raj",233544546);
		hm1.put("Bheem",45346546);
		System.out.println(hm);
		System.out.println("--"+hm.containsKey("Ram"));
		System.out.println("-------"+hm.containsValue(1324655));
		
		hm.putAll(hm1);
		System.out.println(hm);

	}
}
