package com.program;

import java.util.HashMap;

public class DisplayCharFirstIndex {

	public static void main(String[] args) {

		// Input {'r', 'b', 'a', 'c'}; Output : a-1 b-2 a-1 c-3

		char[] ch = { 'k', 'a', 'a', 'v', 'i' };

		int a = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i],a + 1);
				a++;
			}
			System.out.println(ch[i] + " " + map.get(ch[i]));

		}
	}
}
