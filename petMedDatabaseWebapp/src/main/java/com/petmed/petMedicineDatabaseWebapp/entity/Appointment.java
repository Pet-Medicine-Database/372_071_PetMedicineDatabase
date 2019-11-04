package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Calendar;
import java.util.Date;

public class Appointment {
	
	private int appointmentId;
	
	private double price;
	
	private Date appointmentDate;
	
	private Calendar appointmentHour;
	
	private int vetTCNo;
	
	private int animalId;
	
	private int ownerTCNo;
	
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

	public int getVetTCNo() {
		return vetTCNo;
	}

	public void setVetTCNo(int vetTCNo) {
		this.vetTCNo = vetTCNo;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public int getOwnerTCNo() {
		return ownerTCNo;
	}

	public void setOwnerTCNo(int ownerTCNo) {
		this.ownerTCNo = ownerTCNo;
	}
	
	
}
