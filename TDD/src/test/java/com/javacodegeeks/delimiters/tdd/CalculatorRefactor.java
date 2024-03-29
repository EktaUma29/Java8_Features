package com.javacodegeeks.delimiters.tdd;

import com.javacodegeeks.tdd.calculator.NegativesNotAllowed;

public class CalculatorRefactor {
	public Integer addition(String string)  {
		final int ZERO = 0;
		int sum = 0;
		int number;
		if (string.isEmpty()) {
			return 0;
		} else {
			String stringArray[] = string.split("[/\\n;,]+");
			for (int i = 0; i < stringArray.length; i++) {
				if (stringArray.length == 1) {
					if (Integer.parseInt(stringArray[i]) < 0) {
						throw new NegativesNotAllowed("Negatives Number Not Allowed");
					}
					return Integer.parseInt(stringArray[i]);
				} else if (stringArray[i].isEmpty()) {
					number = Integer.parseInt(stringArray[i]);
					number = ZERO;
				} else if (Integer.parseInt(stringArray[i]) > 1 && Integer.parseInt(stringArray[i]) < 0) {
					throw new NegativesNotAllowed("Negatives Number Not Allowed");
				} else {
					sum = sum + Integer.parseInt(stringArray[i]);
				}
			}

		}
		return sum;

	}

}
