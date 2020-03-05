package com.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	

	public static List<Integer> removeDuplicate(List<Integer> list) {

		Set<Integer> set = new LinkedHashSet<Integer>(list);
		
//		list.clear();
		
		return new ArrayList(set);
	}

}
