package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Vet {
	
	private int vetTCNo;
	
	private Date startDate;
	
	private String expertise;
	
	private int numberOfPatients;
	
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
