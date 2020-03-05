package com.yash.service;

import java.util.List;
import com.yash.model.AllEmployeesModel;
import com.yash.model.EmployeesModel;
import com.yash.model.ManagersModel;
import com.yash.model.UpdatableEmployeesModel;

public interface EmployeesService {
	public List<EmployeesModel> retrieveEmployees();

	public List<AllEmployeesModel> retrieveAllEmployees();

	public EmployeesModel retrieveDepartmentName(int employeeId);

	public String registerEmployee(AllEmployeesModel model);

	public String deleteEmployee(AllEmployeesModel employees);

	public EmployeesModel retrieveJobTitle(int employeeId);

	public EmployeesModel retrieveEmployeeTax(int employeeId);

	public List<ManagersModel> getManagers();

	public String updateEmployee(UpdatableEmployeesModel employeesModel);

	public List<AllEmployeesModel> getEmployeesByPage(int pageId, int total);

	public List<EmployeesModel> retrieveEmployees(int pageId, int total);

	public int countNoOfEmployees();
}
