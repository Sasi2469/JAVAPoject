package org.userdefined.list;

public class EmployeeDetails {

	private String name;
	
	private int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	private long phoneNumber;
	
	
	public void setName(String name) {
		this.name= name ;
	}
	
	
	public String getName() {
		
		return name;
		
	}
	
	
}
