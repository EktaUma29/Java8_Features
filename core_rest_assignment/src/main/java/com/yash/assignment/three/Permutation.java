package com.yash.assignment.three;

import java.io.IOException;

public class Permutation {

	public static void main(String[] args) throws Exception, IOException {

		String str = "ABCD";
		int len = str.length();
		Permutation c = new Permutation();

		c.permutation(str, 0, len - 1);

	}

	private void permutation(String str, int l, int r) {

		Permutation c = new Permutation();

		if (l == r) {
			System.out.println(str);
		} else {
			for (int k = l; k <= r; k++) {

				str = c.swap(str, l, k);
				c.permutation(str, l + 1, r);
			}
		}
	}

	private String swap(String str, int i, int j) {

		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);

	}

}
