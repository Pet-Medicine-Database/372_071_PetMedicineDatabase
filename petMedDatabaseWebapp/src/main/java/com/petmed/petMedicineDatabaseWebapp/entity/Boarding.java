package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;

public class Boarding {
	
	
	//link with appointment-id
	//one-to-one
	private Appointment appointment;
	
	
	private int bedId;
	
	private String bedType;
	
	private Date whenToBeAvailable;
	
	private boolean availability;
	
	public Boarding() {
		
	}

	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	public int getBedId() {
		return bedId;
	}

	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public Date getWhenToBeAvailable() {
		return whenToBeAvailable;
	}

	public void setWhenToBeAvailable(Date whenToBeAvailable) {
		this.whenToBeAvailable = whenToBeAvailable;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
	

}
