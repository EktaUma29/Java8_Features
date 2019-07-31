package java8.stream;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {

	
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
		//array.stream().limit(3).forEach(System.out::println);
		//array.stream().skip(2).forEach(System.out::println);
		
//		array.parallelStream().skip(2).forEach(System.out::println);
		array.parallelStream().limit(3).forEach(System.out::println);
	}
}
