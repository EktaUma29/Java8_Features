package java8.features.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapMethod {
	public static void main(String[] args) {
		List<Integer> IntegerList = Arrays.asList(100, 20, 200);
		Map<Integer, Integer> map = IntegerList.stream().collect(Collectors.toMap(n -> n, n->(n*n)));
		System.out.println(map);
	}
}

