package com.custom.classes;

public class ImMutableClass {

	public static void main(String[] args) {
		
	Employee emp = new Employee.EmployeeBuilder("username", "password")
			.name("Ekta")
			.build();
	
		emp.setName("Kabi");
	
		
		System.out.println(emp);
	}

}

	class Employee{
	private String username;
	private String password;
	private int id;
	private String name;
	private String address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(EmployeeBuilder employeeBuilder) {
		super();
		this.username = employeeBuilder.username;
		this.password = employeeBuilder.password;
		this.id = employeeBuilder.id;
		this.name = employeeBuilder.name;
		this.address = employeeBuilder.address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	static class EmployeeBuilder{
		
		private String username;
		private String password;
		private int id;
		private String name;
		private String address;
		
		public EmployeeBuilder(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		
		public EmployeeBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public EmployeeBuilder id(int id) {
			this.id = id;
			return this;
		}
		
		public EmployeeBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}

	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", id=" + id + ", name=" + name
				+ ", address=" + address + "]";
	}
	
}	

