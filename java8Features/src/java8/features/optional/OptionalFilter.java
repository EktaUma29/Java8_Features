package java8.features.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Optional<String> gender = Optional.of("");
	        Optional<String> emptyGender = Optional.empty();
	        Stream<String> stream = Stream.of("");

	        //Filter on Optional
	        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
	        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
	        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty
	        
	        
	        
	     //  stream.map(k -> k.toLowerCase()).forEach(System.out::println);
	      
	}

}
