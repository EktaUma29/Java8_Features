package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpDepMain {

	public static void main(String args[]) {
		EmployeeDetails roshniEmployee = new EmployeeDetails("Roshni Shukla", 35);
		EmployeeDetails ektaEmployee = new EmployeeDetails("Ekta Sharma", 28);
		EmployeeDetails rajeshEmployee = new EmployeeDetails("Rajesh Netam", 29);
		EmployeeDetails rohitEmployee = new EmployeeDetails("Rohit Jain", 32);
		EmployeeDetails sunilEmployee = new EmployeeDetails("Sunil Yadav", 28);
		
		
		
		Departments hr = new Departments("Human Resources");
		hr.addEmployee(roshniEmployee);
		hr.addEmployee(rajeshEmployee);
		hr.addEmployee(rohitEmployee);
		hr.addEmployee(sunilEmployee);
		
		Departments accont = new Departments("Accountants");
		accont.addEmployee(ektaEmployee);
		
		List<Departments> departmentList = new ArrayList<>();
		departmentList.add(hr);
		departmentList.add(accont);
		
		
		departmentList.stream().flatMap(department -> department.getEmployee().stream()).forEach(System.out::println);
		System.out.println("----------------------------------------------------");
		departmentList.stream().map(dept -> dept.getEmployee().stream()).forEach(System.out::println);
		
		System.out.println("--------------------flatMap Started--------------------------------\n");

		Map<Object, List<EmployeeDetails>> groupByAge = departmentList.stream()
				.flatMap(department -> department.getEmployee().stream())
				.collect(Collectors.groupingBy(emp -> emp.getAge()));

		System.out.println(groupByAge);
		
		System.out.println("\n---------------------FlatMap Ended-------------------------------");
		
		departmentList.stream()
					.flatMap(department -> department.getEmployee().stream())
					.reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
					.ifPresent(System.out::println);

	}

}
