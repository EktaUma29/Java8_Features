package core.java.question;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
	
	int empId;
	int salary;

	public Employee(int empId, int salary) {
		this.empId = empId;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
//		Map<Employee, Integer> map = new TreeMap<Employee, Integer>();
		map.put(new Employee(101, 111), 102);
		System.out.println(map.get(new Employee(101, 111)));
		
	}



	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
