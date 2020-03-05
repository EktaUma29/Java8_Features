package com.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DirectIndrectManage {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Nikil", "Rajat");
		map.put("Rajat", "Sai");
		map.put("Ashmi", "Ekta");
		map.put("Ekta", "Mayank");
		map.put("Sai", "Pranali");
		
//		Map.Entry<String, String> mapEntry = (Entry<String, String>) map.entrySet();
		HashSet<String> set  = new HashSet<>();
		String value = map.get("Nikil");
		for(Map.Entry mapEntry: map.entrySet()) {
			set.add(value);
			value = map.get(value);
			
		}
		
		System.out.println(set);
		
	}

}
