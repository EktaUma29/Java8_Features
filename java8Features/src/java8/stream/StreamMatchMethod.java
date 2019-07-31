package java8.stream;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMatchMethod {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		Employee em1 = new Employee(101, "Priya", 100000);
		Employee em2 = new Employee(105, "Roshni", 700000);
		Employee em3 = new Employee(103, "Chhaya", 500000);
		Employee em4 = new Employee(104, "Varsha", 450000);
		Employee em5 = new Employee(10, "Kavita", 110000);

		list.add(em1);
		list.add(em2);
		list.add(em5);
		list.add(em3);
		list.add(em4);

		Predicate<Employee> predicate = o1 -> o1.getSalary() < 50000;

		boolean predicateAllMatch = list.stream().allMatch(predicate);
		boolean predicateAnyMatch = list.stream().anyMatch(predicate);
		
		long count1 = list.stream().count();

		System.out.println(count1);

		if (predicateAllMatch == true) {

			list.stream().map(s1 -> s1.getSalary() + 0.01).forEach(System.out::println);
		}

		Stream.concat(Stream.of("ekta"), Stream.of("Uma")).forEach(element -> System.out.print(element));

	}

}
