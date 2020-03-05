package com.yash.employee.service;

import java.util.List;

import com.yash.employee.entity.Employee;
import com.yash.employee.entity.Salary;


public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Employee getEmployee(int employeeId);
	
	public Salary getSalary(int salaryId);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int employeeId);
	
	public void saveSalary(Salary salary);
	
	public void deleteSalary(int salary);
	
}
