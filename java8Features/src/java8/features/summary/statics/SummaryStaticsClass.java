package java8.features.summary.statics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStaticsClass {

	public static <R> void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> IntegerList = Arrays.asList(7, 5, 6, 2, 1, 9, 3);
		//arrayStream.flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
		
//		IntSummaryStatistics 
		IntSummaryStatistics collect = IntegerList.stream().collect(Collectors.summarizingInt(n -> n));
		System.out.println(collect);
	}

}
