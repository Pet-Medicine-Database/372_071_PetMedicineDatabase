package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vet")
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
