package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;
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
@Table(name="vet")
public class Vet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tc_no")
	private int vetTCNo;
	
	@Column(name="startDate")
	private Date startDate;
	
	@Column(name="expertise")
	private String expertise;
	
	@Column(name="numberOfPatients")
	private int numberOfPatients;
	
	@Column(name="name")
	private String name;
	
	//one-to-many
	@OneToMany(mappedBy="vet" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Animal> animalList;	

	//one-to-many
	@OneToMany(mappedBy="vet" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Appointment> appointmentList;	

	//one-to-many
	@OneToMany(mappedBy="vet" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Examination> examinationList;
			
	//one-to-many
	@OneToMany(mappedBy="vet" ,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Boarding> boardingList;
	
	public Vet() {
		
	}
	
	public int getTCNo() {
		return vetTCNo;
	}

	public void setTCNo(int tCNo) {
		this.vetTCNo = tCNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void setNumberOfPatients(int numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vet [vetTCNo=" + vetTCNo + ", startDate=" + startDate + ", expertise=" + expertise
				+ ", numberOfPatients=" + numberOfPatients + ", name=" + name + "]";
	}
	
	

}
