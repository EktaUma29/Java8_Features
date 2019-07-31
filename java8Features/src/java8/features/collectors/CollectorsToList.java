package java8.features.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> IntegerList = Arrays.asList(7, 5, 6, 2, 1, 9, 3);
		
		/*
		 * IntegerList.stream().filter( n -> n%2
		 * ==0).collect(Collectors.toList()).forEach(System.out::println);
		 * 
		 * Optional<Integer> reduceInt = IntegerList.stream().reduce((n1, n2) -> n1+n2);
		 * System.out.println(reduceInt);
		 */
		
		
		Optional<Integer> sumCollectors = IntegerList.stream().filter(n -> n%2 !=0).collect(Collectors.reducing((n1, n2)-> n1+n2));
		System.out.println(sumCollectors);
		
		
	}

}
