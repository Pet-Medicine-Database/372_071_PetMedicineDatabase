package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Calendar;
import java.util.Date;

public class Appointment {
	
	private int appointmentId;
	
	private double price;
	
	private Date appointmentDate;
	
	private Calendar appointmentHour;
	
	
	//link with vet-id
	//one-to-one
	private Vet vet;
	
	//many-to-one 
	//link with animal-id
	private Animal animal;
	
	//many-to-one
	//link with owner-id
	private Owner owner;
	
	public Appointment() {
		
		
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Calendar getAppointmentHour() {
		return appointmentHour;
	}

	public void setAppointmentHour(Calendar appointmentHour) {
		this.appointmentHour = appointmentHour;
	}

	public Vet getVet() {
		return vet;
	}

	public void setVet(Vet vet) {
		this.vet = vet;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
