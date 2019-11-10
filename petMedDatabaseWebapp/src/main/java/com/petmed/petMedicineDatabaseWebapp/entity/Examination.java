package com.petmed.petMedicineDatabaseWebapp.entity;

public class Examination {

	
	//link with appointment-id
	//one-to-one
	private Appointment appointment;

	public Examination() {
		
		
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


}
