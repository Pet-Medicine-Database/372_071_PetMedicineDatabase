package com.petmed.petMedicineDatabaseWebapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="examination")
public class Examination {

	
	//link with appointment-id
	//one-to-one
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="appointment_id")
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
