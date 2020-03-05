package com.practice;

import java.util.HashMap;
import java.util.Iterator;

public class CheckingMap {

	public static void main(String args[]) {

		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		
		System.out.println(h1);
		
		
	}

}

final class FinalClassExample {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getTestMap() {
		// return testMap;
		return (HashMap<String, String>) testMap.clone();
	}

	public FinalClassExample(int i, String n, HashMap<String, String> hm) {
		System.out.println("Performing Deep  for Object initialization");
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}

	/**
	 * Constructor performing Shallow
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */
	/**
	 * public FinalClassExample(int i, String n, HashMap<String,String> hm){
	 * System.out.println("Performing Shallow for Object initialization");
	 * this.id=i; this.name=n; this.testMap=hm; }
	 */

	/**
	 * To test the consequences of Shallow and how to avoid it with Deep for
	 * creating immutable classes
	 * 
	 * @param args
	 */

}
