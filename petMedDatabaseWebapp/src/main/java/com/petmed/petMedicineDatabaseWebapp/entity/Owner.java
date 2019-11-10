package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.List;

public class Owner {
	
	private String email;
	
	private String job;
	
	private String address;
	
	private int ownerTCNo;
	
	private long phoneNumber;
	
	//link with animal-id
	//one-to-many
	private List<Animal> ownedAnimals;
	
	public Owner() {
		
		
	}
	

	public List<Animal> getOwnedAnimals() {
		return ownedAnimals;
	}


	public void setOwnedAnimals(List<Animal> ownedAnimals) {
		this.ownedAnimals = ownedAnimals;
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
