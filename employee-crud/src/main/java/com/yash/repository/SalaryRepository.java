package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
