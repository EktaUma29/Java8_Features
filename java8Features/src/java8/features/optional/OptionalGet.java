package java8.features.optional;

import java.util.Optional;

public class OptionalGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> optional = Optional.of(null);
		String optionalGet = optional.get();
		System.out.println(optional);
	}

}
