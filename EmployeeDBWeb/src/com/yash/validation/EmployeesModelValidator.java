package com.yash.validation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.yash.model.EmployeesModel;
import com.yash.model.UpdatableEmployeesModel;
import com.yash.service.EmployeesService;

@Component
public class EmployeesModelValidator implements Validator {
	@Autowired
	private EmployeesService employeesService;

	public boolean validate(UpdatableEmployeesModel model) {
		boolean result = false;
		if (validString(model.getFirstName()) && validString(model.getLastName()) && validNumber(model.getEmployeeId())
				&& validSalary(model.getSalary())) {
			result = true;
		}
		return result;
	}

	public boolean validString(String val) {
		boolean result = false;
		char[] chars = val.toCharArray();
		List<Character> alphabets = new ArrayList<>();
		for (int i = 97; i <= 122; i++) {
			alphabets.add((char) i);
		}
		for (char ch : chars) {
			if (alphabets.contains(ch)) {
				result = true;
			} else {
				return false;
			}
		}
		return result;
	}

	public boolean validNumber(int number) {
		boolean result = false;
		String data = String.valueOf(number);
		if (data.matches(".*[0-9]")) {
			result = true;
		}
		return result;
	}

	public boolean validSalary(double salary) {
		boolean result = false;
		String salaryVal = String.valueOf((int) salary);
		if (salary > 0 && salaryVal.length() <= 7) {
			result = true;
		}
		return result;
	}

	public boolean employeeIdExists(int employeeId) {
		List<EmployeesModel> employeesModelList = employeesService.retrieveEmployees();
		for (EmployeesModel employeesModel : employeesModelList) {
			if (employeesModel.getEmployeeId() == employeeId) {
				return true;
			}
		}
		return false;
	}

	public boolean validEmail(String email) {
		boolean result = false;
		if (email.matches("^(.+)@(.+)$")) {
			result = true;
		}
		return result;
	}

	public boolean emailExist(String email) {
		boolean result = false;
		List<EmployeesModel> employeesModelList = employeesService.retrieveEmployees();
		for (EmployeesModel employeesModel : employeesModelList) {
			if (employeesModel.getEmail().contentEquals(email)) {
				return true;
			}
		}
		return result;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return UpdatableEmployeesModel.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UpdatableEmployeesModel model = (UpdatableEmployeesModel) target;
		if (model.getOperation().equals("insert")) {
			if (employeeIdExists(model.getEmployeeId())) {
				errors.rejectValue("employeeId", "com.yash.model.RegisterEmployeesModel.employeeId.exists");
			}
			if (!validString(model.getFirstName())) {
				errors.rejectValue("firstName", "com.yash.model.RegisterEmployeesModel.firstName.invalid");
			}
			if (!validString(model.getLastName())) {
				errors.rejectValue("lastName", "com.yash.model.RegisterEmployeesModel.lastName.invalid");
			}
			if (!validNumber(model.getEmployeeId())) {
				errors.rejectValue("employeeId", "com.yash.model.RegisterEmployeesModel.employeeId.invalid");
			}
			if (!validSalary(model.getSalary())) {
				errors.rejectValue("salary", "com.yash.model.RegisterEmployeesModel.salary.invalid");
			}
			if (emailExist(model.getEmail())) {
				errors.rejectValue("email", "com.yash.model.RegisterEmployeesModel.email.exists");
			}
			if (!validEmail(model.getEmail())) {
				errors.rejectValue("email", "com.yash.model.RegisterEmployeesModel.email.invalid");
			}
		} else {
			if (!validSalary(model.getSalary())) {
				errors.rejectValue("salary", "com.yash.model.RegisterEmployeesModel.salary.invalid");
			}
		}
	}
}