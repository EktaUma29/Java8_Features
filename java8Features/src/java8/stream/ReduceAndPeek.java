package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ReduceAndPeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listArray = Arrays.asList(5, 7, 8);

	
		IntStream intStream = IntStream.of(10, 10, 10);
		OptionalDouble avg = intStream.average();
		System.out.println(avg);
		//Optional<Integer> reduceInt = IntegerList.stream().reduce((n1, n2) -> n1+n2);
		//System.out.println(reduceInt);
	}

}
