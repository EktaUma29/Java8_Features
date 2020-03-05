package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Salary;
import com.yash.service.SalaryService;

@RestController
@RequestMapping("api")
public class SalaryController {
	
	@Autowired
	SalaryService salaryService;

	@GetMapping("employee/{salaryId}/salary")
	public Salary getSalary(int salaryId) {
		
		return salaryService.getSalary(salaryId);
	}
	
}
