package com.practice;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamANDParallel {


	public static void main(String[] args) {

		String i[] = { "A", "B", "C", "D", "A"};
		
//		Arrays.asList(i).parallelStream().map(mapper -> mapper + 10).forEach(System.out::println);
		
		
		Instant start = Instant.now();
		
		long count = Stream.iterate(1, n -> n + 1)
                .limit(10)
//               .parallel()  // with this 23s, without this 1m 10s
                .filter(StreamANDParallel::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();

        System.out.println("\nTotal: " + count);
        
        Instant end = Instant.now();

        Duration interval = Duration.between(start, end);
        
        System.out.println("Interval of Time: " +interval.getSeconds());
        
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number % i == 0);
    }

}
