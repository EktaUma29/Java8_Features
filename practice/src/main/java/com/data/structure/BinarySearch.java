package com.data.structure;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 10, 40 };

		int x = 10;

		int low = 0;
		int high = arr.length - 1;

		System.out.println("Result: che");

		int result = binarySearch(arr, low, high, x);
		System.out.println("Result: " + result);

	}

	static int binarySearch(int arr[], int low, int high, int x) {

		System.out.println("Checkin method");

		int med = 0;

		med = (low + high) / 2;
		
		while (low <= high) {
			
			if (arr[med] < x)
				low = med + 1;
			
			else if (arr[med] == x)
				return med;
			
			else
				high = med - 1;
			
			med = (low + high) / 2;

		}

		return -1;

	}
}
