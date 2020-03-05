package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Check {

	public static void main(String[] args) {

//		Create List<Employee> from Employee class (id, firstName, LastName, Skill, Location) where location =pune, skill=UI 
		
		Emp emp4 = new Emp(1, "ekta", "sharma", "java", "pune");
		
		Emp emp1 = new Emp(2, "anurag", "birthare", "ui", "pune");
		Emp emp2 = new Emp(3, "roshni", "sharma", "ui", "indore");
		Emp emp3 = new Emp(4, "kavita", "jain", "ui", "pune");
		
		String str = "abc";
		int index =0;
		
		char c[] = str.toCharArray();
		char[] array = new char[c.length];
		for(int i = c.length-1; i>=0; i--) {
			array[index++] = c[i];
		}
		
		System.out.println(new String(array));
		
		ArrayList<Emp> list = new ArrayList<>();
				list.add(emp3);
				list.add(emp2);
				list.add(emp1);
				list.add(emp4);
				list.stream().filter(emp -> emp.getSkill().equals("ui") && emp.getLocation().equals("pune")).collect(Collectors.toList()).forEach(System.out::println);
				
//				Function<Emp, Emp> fun = m -> { 
//					if(m.getSkill().equals("ui") && m.getLocation().equals("pune")) 
//						return m;
//					return null;
//				};
//				
//				list.stream()
//				.map(m-> fun.apply(m))
//				.forEach(System.out :: println);
				
		
//		System.out.println(list1);
		
	}
	


}

class Emp{
	private int id;
	private String fName;
	private String lName;
	private String skill;
	private String location;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String fName, String lName, String skill, String location) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.skill = skill;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", fName=" + fName + ", lName=" + lName + ", skill=" + skill + ", location=" + location
				+ "]";
	}
}