package com.hashequals;

public class HashCodesEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setId(10);
		employee.setName("name");
		
		Employee employee1 = new Employee();
		employee1.setId(20);
		employee1.setName("name1");
		
		System.out.println(employee.equ);

	}

}


class Employee{
	
	private int id;
	private String name;
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public  String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
		{ System.out.println("getClass(): "+ getClass());
		System.out.println("obj.getClass(): "+ obj.getClass());
			return false;}
		
		Employee other = (Employee) obj;
		System.out.println("getClass(): "+ this.name);
		System.out.println("obj.getClass(): "+ other.name);
		if (id != other.id)
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/


	}	
		