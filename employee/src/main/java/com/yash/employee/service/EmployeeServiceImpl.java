package com.yash.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.employee.entity.Employee;
import com.yash.employee.entity.Salary;
import com.yash.employee.exception.EmployeeNotFoundException;
import com.yash.employee.exception.SalaryNotFoundException;
import com.yash.employee.jpa.EmployeeRepository;
import com.yash.employee.jpa.SalaryRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SalaryRepository salaryRepository;

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee getEmployee(int employeeId) {
		return employeeRepository.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("Employee Id: " + employeeId + " is not found"));
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int employeeId) {
		employeeRepository.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("Employee Id: " + employeeId + " is not found"));
		employeeRepository.deleteById(employeeId);
	}
	
	@Override
	@Transactional
	public Salary getSalary(int salaryId) {
		return salaryRepository.findById(salaryId).orElseThrow(()->new SalaryNotFoundException("Salary Id: " + salaryId + " is not found"));
	}


	@Override
	public void saveSalary(Salary salary) {
		
		salaryRepository.save(salary);
		
	}

	@Override
	public void deleteSalary(int salaryId) {

		salaryRepository.findById(salaryId).orElseThrow(()->new SalaryNotFoundException("Salary Id: " + salaryId + " is not found"));
		employeeRepository.deleteById(salaryId);
		
	}


}
