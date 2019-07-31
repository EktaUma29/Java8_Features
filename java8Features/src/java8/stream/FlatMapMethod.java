package java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);

		// Stream<String>, GOOD!
		/*
		 * temp.flatMap(x -> Arrays.stream(x)).filter(x ->
		 * "a".equals(x.toString())).forEach(System.out::println);
		 */

		// Stream<String>, GOOD!
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

		Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

		stream.forEach(System.out::println);
		
		

	}

}
