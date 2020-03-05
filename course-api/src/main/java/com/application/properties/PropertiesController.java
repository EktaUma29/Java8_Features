package com.application.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
	
	@Autowired
	private Employee employee;
	
	@GetMapping("/api")
	public String getProperties() {
		
		return "Welcome: " + employee.getName() + " and your department is: " + employee.getDept();
		
	}
	
	@GetMapping("/apis")
	public String getPrroperties() {
		
		return "Welcome: ";
		
	}

}
