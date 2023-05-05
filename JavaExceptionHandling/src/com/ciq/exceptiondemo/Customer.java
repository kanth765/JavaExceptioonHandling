package com.ciq.exceptiondemo;

public class Customer {

	private int id;
	private String name;

	public Customer() {
		if (id == 0 || name == null) {
			throw new IllegalArgumentException("please enter a values.....");
		}
	}

	public Customer(int id, String name) {
		if ( name.isBlank()) {
			throw new IllegalArgumentException("please enter a values.....");
		}
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Customer customer = new Customer(10, "asdf");
		System.out.println(customer);

	}

}
