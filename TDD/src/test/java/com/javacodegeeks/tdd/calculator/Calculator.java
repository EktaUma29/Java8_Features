package com.javacodegeeks.tdd.calculator;

import java.util.logging.Logger;

public class Calculator {

	Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public Integer addition(String string) {
		
		final int ZERO = 0;
		int sum = 0;
		int number;
		
		
		if (string.isEmpty()) {
			logger.info("Should return zero when string is empty.");
			return 0;
		} else {

			// String stringArray[] = string.split(",");
			String stringArray[] = string.split("[/\\n;,]+");
			if (stringArray.length == 1) {
				logger.info("Should return same number when number is one Number");
				return Integer.parseInt(stringArray[0]);

			} else {
				for (int num = 0; num < stringArray.length; num++) {

					if (stringArray[num].isEmpty()) {
						number = ZERO;
					} else {
						if (Integer.parseInt(stringArray[num]) < 0) {
							logger.info("Should return sum of all numbers and accept new line delimiter.");
							throw new NegativesNotAllowed("Negatives Number Not Allowed");
						} else if (Integer.parseInt(stringArray[num]) > 1000) {
							logger.info("Should ignore zero if number is greater than thousand");
							number = 0;
						} else {

							number = Integer.parseInt(stringArray[num]);
						}

					}
					sum = sum + number;
					logger.info("Should return sum of given numbers");
				}
				return sum;
			}
		}

	}

}
