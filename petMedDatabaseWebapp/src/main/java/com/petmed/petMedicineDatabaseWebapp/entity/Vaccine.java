package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;

public class Vaccine {
	
	private int serialNumber;
	
	private String name;
	
	private Date expirationDate;
	
	private int stock;
	
	public Vaccine () {
		
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
