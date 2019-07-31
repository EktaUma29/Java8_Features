package java8.features.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class SortingEmployeeID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee em1 = new Employee(101, "Priya");
		Employee em2 = new Employee(105, "Roshni");
		Employee em3 = new Employee(103, "Chhaya");
		Employee em4 = new Employee(104, "Varsha");
		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);

		Collections.sort(list, (o1, o2) -> { // TODO Auto-generated method stub
			return (o1.getId() > o2.getId()) ? 1 : -1;
		}

		);
		list.stream().forEach(System.out::println);

		System.out.println();
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
		list.stream().sorted(comparator).forEach(System.out::println);

	}

}
