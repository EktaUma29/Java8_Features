package com.custom.classes;

public class Immutable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("pune", "MH");
		Customer em = new Customer(1, address);

		System.out.println(em.getAddress());

		address.setCity("Nagpur");
		address.setState("MP");

		System.out.println(em.getAddress());

	}

}

class Customer {
	private final int id;
	private final Address address;

	public Customer(int id, Address address) {
		super();
		this.id = id;
		Address add = new Address(address.getCity(), address.getState());
		this.address = add;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {

		Address add = new Address();
		add.setCity(this.address.getCity());
		add.setState(this.address.getState());
		return add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}

class Address implements Cloneable {

	String city;
	String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }

}