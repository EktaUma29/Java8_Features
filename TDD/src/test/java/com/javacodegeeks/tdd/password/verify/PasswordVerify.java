package com.javacodegeeks.tdd.password.verify;

import java.util.Optional;

public class PasswordVerify {

	public Boolean checkPassword(String password) {
		// TODO Auto-generated method stub

		int flag = 0;
		Optional<String> passwordNull = Optional.ofNullable(password);

		if (passwordNull.isPresent()) {
			flag = flag + 1;
		} else {
			return false;
		}
		Integer passwordLength = password.length();

		Boolean PasswordIsUpperCase = password.chars().anyMatch(x -> Character.isUpperCase(x));
		Boolean PasswordIsLowerCase = password.chars().anyMatch(x -> Character.isLowerCase(x));
		Boolean passwordIsContainNumber = password.chars().anyMatch(x -> Character.isDigit(x));

		if (PasswordIsUpperCase) {
			flag = flag + 1;
		}
		if (PasswordIsLowerCase) {
			flag = flag + 1;
		}
		if (passwordIsContainNumber) {
			flag = flag + 1;
		}
		if (passwordLength >= 8) {
			flag = flag + 1;
		}
		if (flag == 5) {
			return true;
		} else {
			return false;
		}

	}

	public String atLeastThreeConditionCheck(String password) {
		
		Integer passwordLength = password.length();
		if(passwordLength >= 8){
			
		}
		return null;
	}
}
