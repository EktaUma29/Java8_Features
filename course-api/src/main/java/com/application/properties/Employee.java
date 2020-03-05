
package com.application.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

//@ConfigurationProperties(prefix = "cust.data.employee")
@Configuration("employeeProperties")
//@Component
//@Primary
public class Employee {

	@Value("${cust.data.employee.school}")
	private String name;
	
	@Value("${cust.data.employee.city}")
    private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
    
    
}
