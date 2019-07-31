package com.yash.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Yash1", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Employee employee2 = new Employee("Ram", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Employee employee3 = new Employee("Sita", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

		// Get employee with exact match name "Yash", if not found print "Not found".
		System.out.println("\n--------------------- Employee Details with name Yash --------------------------\n");
		Optional<Employee> optionalYash = employees.stream().filter(c -> "Yash".equals(c.getName())).findAny();


		if (optionalYash.isPresent()) {
			System.out.println(optionalYash);
		} else {
			System.out.println("Not Found");
		}

		// Get employee with matching address "1235"
		System.out.println("\n--------------------- Employee Details with Address 1235 --------------------------\n");

		employees.stream().filter(c -> "1235".equals(c.getAddress().getZipcode())).forEach(System.out::println);

		// Get all employee having mobile numbers 3333.
		System.out.println("\n--------------------- Employee Details with mobile 3333 --------------------------\n");

		Stream<Employee> optionalEmp = employees.stream()
				.filter(c -> c.getMobileNumbers().contains(new MobileNumber("3333")));
		System.out.println(optionalEmp.collect(Collectors.toList()));

		// Convert List<Employee> to List<String> of employee name
		System.out.println(
				"\n--------------------- Converted List<Employee> to List<String> --------------------------\n");
		List<String> listString = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(listString);

		// Collect all the names of employees in a string separated by ||
		System.out.println("\n--------------------- Separated Employees names with || --------------------------\n");
		StringJoiner stringJoiner = new StringJoiner("||");
		stringJoiner.add(employee1.getName());
		stringJoiner.add(employee2.getName());
		stringJoiner.add(employee3.getName());
		System.out.println(stringJoiner);

		// Change the case of List<String>
		System.out.println("\n--------------------- Lower Case --------------------------\n");
		listString.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
		System.out.println("\n---------------------- Upper Case --------------------------");
		listString.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		// Sort List<String>
		System.out.println("\n---------------------- Sorted List by List<String> --------------------------\n");
		listString.stream().sorted().forEach(System.out::println);

		// sort List<Employee> based on name
		System.out.println("\n---------------------- Sorted List by List<Employee> --------------------------\n");
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
		employees.stream().sorted(comparator).forEach(System.out::println);
		

	}
}
