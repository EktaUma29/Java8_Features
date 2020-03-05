package com.program;

public class DisplayCharacterIndex {

	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'd', 'a' };
		int c;
			for (int j = 0; j < ch.length; j++) {
				c = (int) ch[j];

				System.out.println(ch[j] + ": " + (c - 96));

			}
		}
	}

//}
