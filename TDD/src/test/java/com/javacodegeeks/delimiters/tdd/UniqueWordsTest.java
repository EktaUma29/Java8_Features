package com.javacodegeeks.delimiters.tdd;

import java.util.Optional;

public class UniqueWordsTest {
	public static Boolean checkPassword(String password) {
		
		int flag =0;
		Optional<String> passwordNull = Optional.ofNullable(password);
		
		Integer passwordLength = password.length();

		Boolean PasswordIsUpperCase = password.chars().anyMatch(x -> Character.isUpperCase(x));
		Boolean PasswordIsLowerCase = password.chars().anyMatch(x -> Character.isUpperCase(x));
		Boolean passwordIsContainNumber = password.chars().anyMatch(x -> Character.isDigit(x));
	
		if (passwordNull.isPresent()) {
			flag = flag +1;
		}
		if(PasswordIsUpperCase == true){
			flag = flag +1;
		}
		if(PasswordIsLowerCase == true){
			flag = flag +1;
		}
		if(passwordIsContainNumber == true){
			flag = flag +1;
		}
		if(passwordLength >=8){
			flag = flag +1;
		}
		if(flag == 5){
			return true;
		}else{
			return false;
		}
		
		}
	
	public static void main(String[] args) {
		checkPassword("aBtioi98");
	}
	
}
