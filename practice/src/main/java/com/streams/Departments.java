package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Departments {

	private String deptName;
	private List<EmployeeDetails> employees;
	
	public Departments(String deptName) {
		
		this.deptName = deptName;
		employees = new ArrayList<>();
	} 
	
	public void addEmployee(EmployeeDetails employeeDetails) {
		employees.add(employeeDetails);
	}
	
	public List<EmployeeDetails> getEmployee(){
		return employees;
	}

	@Override
	public String toString() {
		return  deptName + " " + employees ;
	}

}
