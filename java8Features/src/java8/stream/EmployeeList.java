package java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee em1 = new Employee(101, "Priya", 10000);
		Employee em2 = new Employee(105, "Roshni", 700000);
		Employee em3 = new Employee(103, "Chhaya", 500000);
		Employee em4 = new Employee(104, "Varsha", 450000);
		Employee em5 = new Employee(10, "Kavita", 110000);
		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		list.add(em5);
		Collections.sort(list, (o1, o2) -> { // TODO Auto-generated method stub
			return (o1.getId() > o2.getId()) ? 1 : -1;
		}

		);
		list.stream().forEach(System.out::println);

		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
		list.stream().sorted(comparator).forEach(System.out::println);

	}

}
