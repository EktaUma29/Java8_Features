package com.bifunction;

interface I{
	public void m1();
}

public class EmployeeData {

	String name;
	int eno;

	public EmployeeData() {
		super();
		System.out.println(" default checking");
	}

	public EmployeeData(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

}
