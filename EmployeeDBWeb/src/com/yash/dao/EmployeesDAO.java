package com.yash.dao;

import java.sql.SQLException;
import java.util.List;

import com.yash.entities.Employees;

public interface EmployeesDAO {
	public List<Employees> getAllEmployees() throws ClassNotFoundException, SQLException;

	public Employees getDeparmentName(int employeeId) throws ClassNotFoundException, SQLException;

	public boolean storeEmployeeDetails(Employees employees) throws ClassNotFoundException, SQLException;

	public boolean updateEmployee(Employees employees) throws ClassNotFoundException, SQLException;

	public boolean deleteEmployeeDetails(Employees employees) throws ClassNotFoundException, SQLException;

	public String getJobTitle(int employeeId) throws ClassNotFoundException, SQLException;

	public Employees getEmployeeTaxOnSalary(int employeeId) throws ClassNotFoundException, SQLException;

	public List<Employees> getManagers() throws ClassNotFoundException, SQLException;

	public List<Employees> getEmployeesByPage(int pageid, int total) throws ClassNotFoundException, SQLException;

	public int countNoOfRows() throws ClassNotFoundException, SQLException;
}
