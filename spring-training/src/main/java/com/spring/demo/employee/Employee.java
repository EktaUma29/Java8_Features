package com.spring.demo.employee;

public class Employee {

	private int empId;
	private double salary;

	

	public Employee(int empId) {
		System.out.println("EmplId Called: " + empId);
		this.empId = empId;
	}
	
	public Employee(double salary) {
		System.out.println("salary Called: " + salary);
		this.salary = salary;
	}
}
