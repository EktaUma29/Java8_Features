package java8.features.optional;

import java.util.Optional;

public class OptionalFlapMapAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Optional<String> nonEmptyGender = Optional.of("male");
	        Optional<String> emptyGender = Optional.empty();
	        String value = null;

	        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
	        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

	        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
	        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
	        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
	        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
	        
	    }
	}


