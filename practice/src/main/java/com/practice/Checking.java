package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

class Checking {

	public static void main(String args[]) {

		int[][] arr = { { 5, 10 }, { 8, 12 }, {8, 12} };
//		 int [][] arr = {{5, 10}};

		int i = inputM(3, arr);

		System.out.println(i);

	}

	private static int inputM(int i, int[][] arr) {

		if (i == 1) {
			return Math.abs(arr[0][0] - arr[0][1]);
		} else {
			for (int k = 0; k<i; k++) {
				for (int l = 1; l < i;) {
					int first = Math.abs(arr[k][k] - arr[k][l]);
					int second = Math.abs(arr[l][k] - arr[l][l]);
					return first + second - Math.abs(arr[k][l] - arr[l][k]);
				}

			}
		}

		return 0;
	}

}
