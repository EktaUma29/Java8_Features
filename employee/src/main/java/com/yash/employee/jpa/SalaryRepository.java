package com.yash.employee.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.employee.entity.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
