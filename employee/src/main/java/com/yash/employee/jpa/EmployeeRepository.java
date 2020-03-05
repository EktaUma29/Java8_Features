package com.yash.employee.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
