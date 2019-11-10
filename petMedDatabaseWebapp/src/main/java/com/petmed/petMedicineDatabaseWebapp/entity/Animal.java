package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.List;

public class Animal {

	private String name;
	
	private String type;
	
	private int animalId;
	
	private String genus;
	
	private int age;
	
	private Vet vet;
	
	private Owner owner;
	
	//hayvancagizin girdigi butun appointmentlari burda tutmali.
	private List<Appointment> apppointmentList;

	//We won't be using this but to show the options while selecting a vet for animal, we need all vetList.
	private List<Vet> vetList;
	
	

	public Animal() {
		
		//Bir query atip sahip oldugumuz butun veterinerleri @param vetList'e koyar misiniz?
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Vet getVet() {
		return vet;
	}

	public void setVet(Vet vet) {
		this.vet = vet;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	
	
}
