package com.collection;

import java.util.HashMap;

public class CyclicString {

	public static void main(String[] args) {


		System.out.println(check());
		
	}

	private static int check() {
		
		int i = 0;
		try {
			i =1;
			int a= 3/0;
			return i;
		}
		catch (Exception e) {

			i=2;
			return i;
			
		}
		finally {
			i=3;
			//return i;
		}
		return 5;
	}


}

class Ekta{
	
	int id;
	String name;
	
	
	
	@Override
	public String toString() {
		return "Ekta [id=" + id + ", name=" + name + "]";
	}
	public Ekta(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
			return false;
		Ekta other = (Ekta) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}