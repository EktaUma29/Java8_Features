package com.program;

import java.util.HashMap;

public class CountNumberOccurance {

	public static void main(String[] args) {

		int nums[] = {1, 2, 2, 3, 1};
		
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0; i<nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.putIfAbsent(nums[i], 1);
			}
			else 
				map.put(nums[i], map.get(nums[i])+1);
		}
		
		System.out.println(map);
	}

}
