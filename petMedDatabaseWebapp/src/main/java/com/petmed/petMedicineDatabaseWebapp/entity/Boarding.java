package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="boarding")
public class Boarding {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bed_id")
	private int bedId;
	
	@Column(name="bed_type")
	private String bedType;
	
	@Column(name="when_to_be_available")
	private Date whenToBeAvailable;
	
	@Column(name="is_available")
	private boolean availability;
	
	@Column(name="price")
	private double price;
	
	@Column(name="appointment_date")
	private Date appointmentDate;
	
	@Column(name="appointment_hour")
	private Calendar appointmentHour;
	
	//many-to-one 
	//link with vet-id
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="vet_tc_no")
	private Vet vet;
		
	//many-to-one 
	//link with animal-id
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id")
	private Animal animal;
		
	//many-to-one
	//link with owner-id
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="owner_tc_no")
	private Owner owner;
	
	//link with appointment-id
	//one-to-one
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="appointment_id")
	private Appointment appointment;
	
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
	
	
	

}
