package java8.features.optional;

import java.util.Optional;
public class OptionalIsPresentIfPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        if (emptyGender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        //condition failed, no output print
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));
	}

}
