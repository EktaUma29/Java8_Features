package com.main.topic;

public class Topic {
	
	int id;
	String name;
	
	public Topic() {
		super();
	}


	public Topic(int id, String name) {
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
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + "]";
	}
	
	

}
