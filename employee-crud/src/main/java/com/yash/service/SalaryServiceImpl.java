package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Salary;
import com.yash.repository.SalaryRepository;

@Service
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	SalaryRepository salaryRepository;

	@Override
	public Salary getSalary(int salaryId) {
		return salaryRepository.findById(salaryId).orElseThrow(()->new RuntimeException());
	}

}
