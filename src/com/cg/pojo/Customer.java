package com.cg.pojo;

public class Customer {
	
	private String name;
	private String email;
	private String dob;
	private String phone;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public String getPhone() {
		return phone;
	}
	
	
	public Customer(String name, String email, String dob, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Account Holder Name : " + name + 
	"\nEmail : " + email 
	+ "\nDate of Birth : " + dob + 
	"\nPhone : " + phone;
	}
	
	

}
