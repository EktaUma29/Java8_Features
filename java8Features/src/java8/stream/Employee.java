package java8.stream;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
	}

	int id;
	String name;
	int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

}
