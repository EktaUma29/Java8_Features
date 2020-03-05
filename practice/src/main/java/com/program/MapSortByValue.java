package com.program;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortByValue {

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(Map<K, V> map) {

		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				
				return map.get(k1).compareTo(map.get(k2));
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Ekta", 5);
		map.put("Priya", 3);
		map.put("Kavi", 1);

		Map map1 = sortByValues(map);
		System.out.println(map1);
	}

}
