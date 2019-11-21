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
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="appoinment_id")
	private int appointmentId;
	
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
	@JoinColumn(name="animal_id")
	private Animal animal;
	
	//many-to-one
	//link with owner-id
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="owner_tc_no")
	private Owner owner;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="examination_id")		//referenced at SQL
	private Examination examination;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bed_id")		//referenced at SQL
	private Boarding boarding;
	
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
	
	public Examination getExamination() {
		return examination;
	}

	public void setExamination(Examination examination) {
		this.examination = examination;
	}

	public Boarding getBoarding() {
		return boarding;
	}

	public void setBoarding(Boarding boarding) {
		this.boarding = boarding;
	}

	@Override
	public String toString() {
		return "Appointment[ AppointmentID:" + appointmentId + ", Price:" + price + ", Appointment_date:" + appointmentDate + ", Appoinment_hour" + appointmentHour +
				", Vet:" + vet + ", Animal:" + animal + ", Owner:" + owner + " ]";
	}
}
