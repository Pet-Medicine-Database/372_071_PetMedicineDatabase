package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="boarding")
public class Boarding {
	
	
	//link with appointment-id
	//one-to-one
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="appointment_id")
	private Appointment appointment;
	
	@Column(name="bed_id")
	private int bedId;
	
	@Column(name="bed_type")
	private String bedType;
	
	@Column(name="when_to_be_available")
	private Date whenToBeAvailable;
	
	@Column(name="is_available")
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
