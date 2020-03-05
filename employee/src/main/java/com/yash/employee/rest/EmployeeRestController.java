package com.yash.employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.employee.entity.Employee;
import com.yash.employee.entity.Salary;
import com.yash.employee.exception.EmployeeNotFoundException;
import com.yash.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Employee Entity!!!!")
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@ApiOperation(value = "Get list of Employee Details in the System ", response = Iterable.class, tags = "getEmployees")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping(value = "/employees", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getEmployees() {

		
		List<Employee> employeeList = employeeService.getEmployees();

		return employeeList;
	}

	@ApiOperation(value = "Get specific Employee in the System ", response = Employee.class, tags = "getEmployee")
	@GetMapping(value = "/employees/{employeeId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Employee getEmployee(@PathVariable int employeeId ) {

		Employee employee = employeeService.getEmployee(employeeId);

		if (employee == null) {
			throw new EmployeeNotFoundException("Employee Id: " + employeeId + " is not found");
		}


		return employee;
	}

	@ApiOperation(value = "Post specific Employee details in the System ", response = Employee.class, tags = "postEmployee")
	@PostMapping(value = "/employees", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Employee addEmployee(@RequestBody Employee employee) {

		employee.setId(0);
		
		employeeService.saveEmployee(employee);
			return employee;
	}
	@ApiOperation(value = "Put specific Employee details in the System ", response = Employee.class, tags = "putEmployee")
	@PutMapping(value = "/employee/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		
		employeeService.saveEmployee(employee);
		
	}

	@ApiOperation(value = "Delete specific Employee Details in the System ", response = Employee.class, tags = "deleteEmployee")
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {

		Employee employee = employeeService.getEmployee(employeeId);

		if (employee == null) {
			throw new EmployeeNotFoundException(
					"Deletion can't perform because Employee Id: " + employeeId + " is not found");
		}
		employeeService.deleteEmployee(employeeId);

		return "Deleted Employee with ID: " + employeeId;
	}
	
	@ApiOperation(value = "Post specific Employee's salary details in the System ", response = Salary.class, tags = "postSalary")
	@PostMapping(value = "/salary", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Salary addSalary(@RequestBody Salary salary) {

		salary.setSalary_id(0);
		
		employeeService.saveSalary(salary);
			return salary;
	}
	@ApiOperation(value = "Put specific Employee's salary details in the System ", response = Salary.class, tags = "putSalary")
	@PutMapping(value = "/salary/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public void updateSalary(@RequestBody Salary salary, @PathVariable String id) {
		salary.setSalary_id(Integer.parseInt(id));
		employeeService.saveSalary(salary);
		
	}

	@ApiOperation(value = "Delete specific Employee's salary Details in the System ", response = Salary.class, tags = "deleteSalary")
	@DeleteMapping("/salary/{salaryId}")
	public String deleteSalary(@PathVariable int salaryId) {

		Salary salary = employeeService.getSalary(salaryId);

		if (salary == null) {
			throw new EmployeeNotFoundException(
					"Deletion can't perform because Saalry Id: " + salaryId + " is not found");
		}
		employeeService.deleteEmployee(salaryId);

		return "Deleted Employee with ID: " + salaryId;
	}
	
	@ApiOperation(value = "Get specific Employee in the System ", response = Salary.class, tags = "getSalary")
	@GetMapping(value = "/salary/{salaryId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Salary getsalary(@PathVariable int salaryId ) {

		Salary salary = employeeService.getSalary(salaryId);

		if (salary == null) {
			throw new EmployeeNotFoundException("Employee Id: " + salaryId + " is not found");
		}


		return salary;
	}
}
