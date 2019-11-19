package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="vaccine")
public class Vaccine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="serial_number")
	private int serialNumber;
	
	@Column(name="name")
	private String name;
	
	@Column(name="expiration_date")
	private Date expirationDate;
	
	@Column(name="stock")
	private int stock;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH
			,CascadeType.MERGE
			,CascadeType.PERSIST
			,CascadeType.REFRESH})
	@JoinTable(
			name = "animal",
			joinColumns = @JoinColumn(name="serial_number"),			
			inverseJoinColumns = @JoinColumn(name="id")		
			)
	private List<Animal> animalList;
	
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

	public List<Animal> getAnimalList() {
		return this.animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}
	
	
}
