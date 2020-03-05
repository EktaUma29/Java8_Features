package com.yash.employee.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.employee.entity.Employee;
import com.yash.employee.entity.Salary;
import com.yash.employee.exception.EmployeeNotFoundException;
import com.yash.employee.jpa.EmployeeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceImplTest {

	@InjectMocks
	private EmployeeServiceImpl employeeService;

	@Mock
	private EmployeeRepository employeeDAO;

	@Test
	public void shouldReturnAllEmployeeDetails() {

		List<Employee> employeeList = new ArrayList<Employee>();

		Salary salary = new Salary(1, 50000);
		
		Employee employee1 = new Employee(5, "Maxwell", "Dixon", "max@luv2code.com", salary);
		Employee employee2 = new Employee(6, "David", "Adams", "david@luv2code.com", salary);

		employeeList.add(employee1);
		employeeList.add(employee2);

		when(employeeDAO.findAll()).thenReturn(employeeList);
		List<Employee> actualEmployeeList = employeeService.getEmployees();
		verify(employeeDAO).findAll();
		assertEquals(employeeList, actualEmployeeList);

	}

//	@Test
//	public void shouldReturnEmployeeDetailsByID() {
//
//		Salary salary = new Salary(1, 50000);
//		
//		Employee employee1 = new Employee(5, "Maxwell", "Dixon", "max@luv2code.com", salary);
//		when(employeeDAO.findById(5)).thenReturn(Optional.of(employee1));
//
//		Employee actual = employeeService.getEmployee(5);
//		verify(employeeDAO).findById(5);
//		assertEquals(employee1, actual);
//
//	}
//
//	@Test
//	public void shouldAddEmployeeDetails() {
//
//		Employee employee = new Employee();
//		employee.setId(100);
//		employee.setFirstName("Ekta");
//		employee.setLastName("Sharma");
//		employee.setEmail("ekta@gmail.com");
//
//		when(employeeDAO.save(employee)).thenReturn(employee);
//		employeeService.saveEmployee(employee);
//		verify(employeeDAO).save(employee);
//		;
//	}
//
//	@Test
//	public void shouldDeleteEmployeeDetailsByID() {
//
//		Salary salary = new Salary(1, 50000);
//		
//		Employee employee = new Employee(5, "Maxwell", "Dixon", "max@luv2code.com", salary);
//
//		when(employeeDAO.findById(5)).thenReturn(Optional.of(employee));
//		doNothing().when(employeeDAO).deleteById(5);
//		employeeService.deleteEmployee(5);
//		;
//		verify(employeeDAO).deleteById(5);
//
//	}
//	
//	
//	@Test(expected = EmployeeNotFoundException.class)
//    public void shouldThrowExceptionWhenEmployeeIDIsInvalidForDeletion() {
//           
//           when(employeeDAO.findById(5)).thenThrow(new EmployeeNotFoundException("No Such Employee"));
//           employeeService.deleteEmployee(5);;
//    }
//    
//    @Test(expected = EmployeeNotFoundException.class)
//    public void shouldReturnNullORExceptionWhenEmployeeIDisInvalid() {
//           
//           when(employeeDAO.findById(5)).thenReturn(Optional.ofNullable(null));
//           employeeService.getEmployee(5);
//    }
    


}
