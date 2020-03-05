package com.clone;

public class Department {

	Department department;

	private int Id;
	private String name;

	public Department(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public Department(Department department) {
		this.department = department;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}

	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// // TODO Auto-generated method stub
	// return super.clone();
	// }
}
