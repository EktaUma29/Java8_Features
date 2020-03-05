package com.predicate.supplier.employees;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeesMain {

	public static void main(String[] args) {

		Employee roshniEmployee = new Employee("Roshni Shukla", 35);
		Employee rajeshEmployee = new Employee("Rajesh Netam", 29);
		Employee rohitEmployee = new Employee("Rohit Jain", 32);
		Employee sunilEmployee = new Employee("Sunil Yadav", 30);
		Employee ektaEmployee = new Employee("Ekta Sharma", 28);

		ArrayList<Employee> employeesList = new ArrayList<>();
		employeesList.add(ektaEmployee);
		employeesList.add(sunilEmployee);
		employeesList.add(rohitEmployee);
		employeesList.add(rajeshEmployee);
		employeesList.add(roshniEmployee);

		/* employeesList.forEach(System.out:: println); */

		printValue(employeesList, "-----Employee Age under 30--------", predicate -> predicate.getAge() < 30);
		printValue(employeesList, "-----Employee Age equal or over 30--------", predicate -> predicate.getAge() >= 30);

		System.out.println("~~~~~~~~~~~~~ Supplier ~~~~~~~~~~~~~~~~~~~");
		Random random = new Random();

		Supplier<Integer> randomSupplier = () -> random.nextInt(100);
		for (int i = 0; i <= 10; i++) {
			System.out.println(randomSupplier.get());

		}

		System.out.println("~~~~~~~~~~~~~ Function ~~~~~~~~~~~~~~~~~~~");

		/*
		 * employeesList.forEach(emp -> {
		 * 
		 * String lastName =
		 * emp.getName().substring(emp.getName().indexOf(" "));
		 * System.out.println("Last Name: "+ lastName);
		 * 
		 * });
		 */
		Function<Employee, String> getLastName = (Employee employee) -> {

			return employee.getName().substring(employee.getName().indexOf(" "));
		};
		
		
		
		Function<Employee, String> lastName = employee1 -> employee1.getName().toUpperCase();
		Function<String, String>  firstName = name -> name.substring(0, name.indexOf(" "));
		Function chaninedFunction = lastName.andThen(firstName);
		System.out.println(chaninedFunction.apply(employeesList.get(0)));
		
		
		System.out.println(getLastName.apply(employeesList.get(1)));

	}

	public static void printValue(ArrayList<Employee> employees, String message, Predicate<Employee> predicate) {
		System.out.println("~~~~~~~~~~~~~" + message + "~~~~~~~~~~~~~");
		for (Employee employee : employees) {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		}

	}

}
