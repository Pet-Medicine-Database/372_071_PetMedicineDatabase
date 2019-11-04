package com.petmed.petMedicineDatabaseWebapp.entity;

public class Owner {
	
	private String email;
	
	private String job;
	
	private String address;
	
	private int ownerTCNo;
	
	private long phoneNumber;
	
	public Owner() {
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getOwnerTCNo() {
		return ownerTCNo;
	}

	public void setOwnerTCNo(int ownerTCNo) {
		this.ownerTCNo = ownerTCNo;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
