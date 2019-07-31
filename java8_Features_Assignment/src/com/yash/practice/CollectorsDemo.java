package com.yash.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 11, 20, 33, 4, 44, 55, 20);

		// collect the result of a Stream into Set
		System.out.println("\n--------------------- Collect the result of a Stream into Set --------------------------\n");
		Set<Integer> setNumbers = numbers.stream().collect(Collectors.toSet());
		System.out.println(setNumbers);

		// collect the result of a Stream into list
		System.out.println("\n--------------------- Collect the result of a Stream into list --------------------------\n");
		List<Integer> listNumbers = numbers.stream().collect(Collectors.toList());
		System.out.println(listNumbers);

		// create Map from the elements of Stream (first remove the duplicates)
		System.out.println("\n--------------------- Create Map from the elements of Stream (first remove the duplicates) --------------------------\n");
		Map<Integer, Integer> map = numbers.stream().distinct()
				.collect(Collectors.toMap(Integer::intValue, Integer::intValue));
		System.out.println(map);

		// find summary statistics from a Stream of numbers
		System.out.println("\n--------------------- Find summary statistics from a Stream of numbers --------------------------\n");
		LongSummaryStatistics longSummaryStatistics = numbers.stream()
				.collect(Collectors.summarizingLong(Integer::intValue));
		System.out.println(longSummaryStatistics);

		// partition the result of Stream in two parts i.e., odd and even
		System.out.println("\n--------------------- Partition the result of Stream in two parts i.e., odd and even --------------------------\n");
		Predicate<Integer> predicate = p -> p % 2 == 0;
		Map<Boolean, List<Integer>> mapPartition = numbers.stream().collect(Collectors.partitioningBy(predicate));
		System.out.println(mapPartition);

		// create comma separated string from numbers
		System.out.println("\n--------------------- Create comma separated string from numbers --------------------------\n");
		StringJoiner stringJoiner = new StringJoiner(", ");

		for (Integer i : numbers) {
			stringJoiner.add(i.toString());
		}
		System.out.println(stringJoiner);

	}
}
