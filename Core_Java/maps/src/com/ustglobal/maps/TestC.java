package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh=new LinkedHashMap<String, Integer>();
		lh.put("Bangalore",56001);
		lh.put("Tumkur",59001);
		lh.put("Haveri",58011);
		lh.put("Hubli",57201);
		System.out.println(lh);

		Set<String> s=lh.keySet();
		for (String string : s) {
			System.out.println(string);
		}
		Collection<Integer> c=lh.values();
		System.out.println(c);
		for(Map.Entry<String, Integer> m: lh.entrySet())
			System.out.println(m.getValue());
	}
}
