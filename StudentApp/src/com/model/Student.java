package com.model;

public class Student {
	private String firstname;
	private String lastname;
	private int roll;
	private int marks;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student()
	{
		
	}
	public Student(String firstname, String lastname, int roll, int marks) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", roll=" + roll + ", marks=" + marks+"]";
	}
	

}
