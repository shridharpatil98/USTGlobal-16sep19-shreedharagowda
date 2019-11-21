package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestD {
public static void main(String[] args) {
	TreeMap<String, Integer> lh=new TreeMap<String, Integer>();
	lh.put("Bangalore",56001);
	lh.put("Tumkur",59001);
	lh.put("Haveri",58011);
	lh.put("Hubli",57201);
	
	for(Map.Entry<String, Integer> m: lh.entrySet())
		System.out.println(m.getKey());
	
}
}
