package com.myapp.to;

public class Student {
	
	private String firstname;
	private String lastname;
	private int roll;
	private String email;
	private long mobileno;
	private int age;
	private String dob;
	private String gender;
	private String[] language;
	static int id=101;
	
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
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getLanguage() {
		return language;
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public Student()
	{}
	public Student(String firstname, String lastname,int roll,String email, long mobileno, int age,String dob,String gender,String[] language) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.roll =roll;
		this.email = email;
		this.mobileno = mobileno;
		this.age = age;
		this.dob=dob;
		this.gender=gender;
		this.language=language;
		id++;
	}
	

}
