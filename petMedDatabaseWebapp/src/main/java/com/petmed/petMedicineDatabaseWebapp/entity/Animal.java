package com.petmed.petMedicineDatabaseWebapp.entity;

public class Animal {

	private String type;
	
	private int animalId;
	
	private String genus;
	
	private int age;
	
	private int vetTCNo;
	
	private int ownerTCNo;
	
	public Animal() {
		
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getVetTCNo() {
		return vetTCNo;
	}

	public void setVetTCNo(int vetTCNo) {
		this.vetTCNo = vetTCNo;
	}

	public int getOwnerTCNo() {
		return ownerTCNo;
	}

	public void setOwnerTCNo(int ownerTCNo) {
		this.ownerTCNo = ownerTCNo;
	}
	
	
	
}
