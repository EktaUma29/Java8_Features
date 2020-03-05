/*package com.yash.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "technologies")
public class Technologies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Tech_ID")
	private int tech_ID;

	@Column(name = "Technologies")
	private String technologies;
	
	@ManyToOne
	@JoinColumn(name = "employee_ID")
    private Employee employee_ID;

	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technologies(int tech_ID, String technologies, Employee employee_ID) {
		super();
		this.tech_ID = tech_ID;
		this.technologies = technologies;
		this.employee_ID = employee_ID;
	}

	public int getTech_ID() {
		return tech_ID;
	}

	public void setTech_ID(int tech_ID) {
		this.tech_ID = tech_ID;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public Employee getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(Employee employee_ID) {
		this.employee_ID = employee_ID;
	}
 
    
	
}
*/