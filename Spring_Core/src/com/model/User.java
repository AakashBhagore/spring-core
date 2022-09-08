package com.model;

public class User {

	private int rollNumber;
	private String name;
	
	public void display() {
		System.out.println("rollNumber:- "+rollNumber+ " name:- "+name);
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
}
