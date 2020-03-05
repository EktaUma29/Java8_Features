package com.yash.spring;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		for (Integer integer : l1) {
			l1.remove(0);
			l1.remove(1);
			System.out.println(integer);
		}
	}

}
