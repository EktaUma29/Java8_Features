package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {


	public static void main(String[] args) {

		List<String> bingoNumbers = Arrays.asList(
				"N36", "N21", "N40",
				"B12", "B10", "B30",
				"G20", "G10", "G64", "g20", "G49",
				"M2", "M9",
				"I26", "I17", "I29",
				"O71");
		
//	ArrayList<String> bingoNumberList = new ArrayList<>();
//		
//		bingoNumbers.forEach(number -> {
//				if(number.toUpperCase().startsWith("G")) {
//					bingoNumberList.add(number);
//				}
//				
//			});
//		bingoNumberList.sort((String s1, String s2) -> s1.compareTo(s2));
//		bingoNumberList.forEach(System.out::println);
		
		bingoNumbers
		.stream()
		.map(number -> number.toUpperCase())
		.filter(predicate -> predicate.startsWith("G"))
		.sorted()
		.forEach(System.out::println);
		
	System.out.println("------------------------------------------");
	
	Stream<String> ioNumbers = Stream.of("I26", "I17", "I29", "O71");
	Stream<String> inNumbers = Stream.of("N36", "N21", "N40", "I26", "I17", "I29", "O71");
	
	Stream<String> concatNumbers = Stream.concat(ioNumbers, inNumbers);
	System.out.println(concatNumbers.distinct().peek(System.out::println).count());
	
		
	}

}
