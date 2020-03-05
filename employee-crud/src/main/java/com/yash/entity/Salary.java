package com.yash.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name ="salary")
	private Long salary;
	
	@OneToOne(fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			mappedBy = "salary")
	private Employee employee;

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(Long salary, Employee employee) {
		super();
		this.salary = salary;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", salary=" + salary + ", employee=" + employee + "]";
	}
	
	

}
