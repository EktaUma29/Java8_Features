package java8.stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 4, 7, 2, 4, 8 };

		Stream<int[]> arrayStream = Stream.of(array);
		arrayStream.flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);

		 
		OptionalDouble dstream = arrayStream.mapToDouble(k -> k.length).average();
		System.out.print(dstream);
	}

}
