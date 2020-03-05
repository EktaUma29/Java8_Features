package com.yash.model;

import java.util.List;

public class UpdatableEmployeesModel {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private double salary;
	private double commissionPCT;
	private int managerId;
	private int departmentId;
	private String operation;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	private List<DepartmentsModel> departmentsList;
	private List<JobsModel> jobsList;
	private List<ManagersModel> managersList;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommissionPCT() {
		return commissionPCT;
	}

	public void setCommissionPCT(double commissionPCT) {
		this.commissionPCT = commissionPCT;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public List<DepartmentsModel> getDepartmentsList() {
		return departmentsList;
	}

	public void setDepartmentsList(List<DepartmentsModel> departmentsList) {
		this.departmentsList = departmentsList;
	}

	public List<JobsModel> getJobsList() {
		return jobsList;
	}

	public void setJobsList(List<JobsModel> jobsList) {
		this.jobsList = jobsList;
	}

	public List<ManagersModel> getManagersList() {
		return managersList;
	}

	public void setManagersList(List<ManagersModel> managersList) {
		this.managersList = managersList;
	}

	@Override
	public String toString() {
		return "RegisterEmployeesModel [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId="
				+ jobId + ", salary=" + salary + ", commissionPCT=" + commissionPCT + ", managerId=" + managerId
				+ ", departmentId=" + departmentId + ", departmentsList=" + departmentsList + ", jobsList=" + jobsList
				+ ", managersList=" + managersList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(commissionPCT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + departmentId;
		result = prime * result + ((departmentsList == null) ? 0 : departmentsList.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((jobsList == null) ? 0 : jobsList.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + managerId;
		result = prime * result + ((managersList == null) ? 0 : managersList.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UpdatableEmployeesModel other = (UpdatableEmployeesModel) obj;
		if (Double.doubleToLongBits(commissionPCT) != Double.doubleToLongBits(other.commissionPCT))
			return false;
		if (departmentId != other.departmentId)
			return false;
		if (departmentsList == null) {
			if (other.departmentsList != null)
				return false;
		} else if (!departmentsList.equals(other.departmentsList))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (jobsList == null) {
			if (other.jobsList != null)
				return false;
		} else if (!jobsList.equals(other.jobsList))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (managerId != other.managerId)
			return false;
		if (managersList == null) {
			if (other.managersList != null)
				return false;
		} else if (!managersList.equals(other.managersList))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
}
