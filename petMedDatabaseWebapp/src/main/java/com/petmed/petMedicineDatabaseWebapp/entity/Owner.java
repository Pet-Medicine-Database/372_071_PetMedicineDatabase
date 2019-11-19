package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {
	
	@Column(name="e_mail")
	private String email;
	
	@Column(name="job")
	private String job;
	
	@Column(name="address")
	private String address;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tc_no")
	private int ownerTCNo;
	
	@Column(name="phone_number")
	private long phoneNumber;
	
	//TODO add this attribute to owner table
	@Column(name="name")
	private String name;
	

	//one-to-many
	@OneToMany(mappedBy="owner" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Animal> animalList;	

	//one-to-many
	@OneToMany(mappedBy="owner" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Appointment> appointmentList;	

	//one-to-many
	@OneToMany(mappedBy="owner" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Examination> examinationList;
		
	//one-to-many
	@OneToMany(mappedBy="owner" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Boarding> boardingList;
	
	public Owner() {
		
		
	}

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getOwnerTCNo() {
		return ownerTCNo;
	}

	public void setOwnerTCNo(int ownerTCNo) {
		this.ownerTCNo = ownerTCNo;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}


	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}


	public List<Examination> getExaminationList() {
		return examinationList;
	}


	public void setExaminationList(List<Examination> examinationList) {
		this.examinationList = examinationList;
	}


	public List<Boarding> getBoardingList() {
		return boardingList;
	}


	public void setBoardingList(List<Boarding> boardingList) {
		this.boardingList = boardingList;
	}


	@Override
	public String toString() {
		return "Owner [email=" + email + ", job=" + job + ", address=" + address + ", ownerTCNo=" + ownerTCNo
				+ ", phoneNumber=" + phoneNumber + ", name=" + name + "]";
	}
	
	
	

}
