package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeAndFailFast {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(1);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("In Methid");
			System.out.println(itr.next() + " ");
			list.add(1000000);
			list.remove(0);
		}
		
		System.out.println("List " +list);
		
	}

}
