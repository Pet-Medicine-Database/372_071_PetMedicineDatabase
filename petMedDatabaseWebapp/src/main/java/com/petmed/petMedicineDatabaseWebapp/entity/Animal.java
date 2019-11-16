package com.petmed.petMedicineDatabaseWebapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@Entity
@Table(name="animal")
public class Animal {

	@Column(name="name")
	private String name;
	
	@Column(name="animal_type")
	private String type;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int animalId;
	
	@Column(name="genus")
	private String genus;
	
	@Column(name="age")
	private int age;
	
	//many-to-one 
	//link with vet-id
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="tc_no")
	private Vet vet;
	
	//many-to-one 
	//link with owner-id
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="tc_no")
	private Owner owner;
	
	//hayvancagizin girdigi butun appointmentlari burda tutmali.
	private List<Appointment> apppointmentList;

	//We won't be using this but to show the options while selecting a vet for animal, we need all vetList.
	private List<String> vetList;
	
	

	public Animal() {	
		//Query for get all vets we have		
		// Create the SessionFactory from hibernate.cfg.xml
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession() ;
		String hql = "FROM Vet";
		//Needs to be tested
		Query<String> query = session.createQuery(hql);
		vetList=query.list();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Vet getVet() {
		return vet;
	}

	public void setVet(Vet vet) {
		this.vet = vet;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", animalId=" + animalId + ", genus=" + genus + ", age="
				+ age + ", vet=" + vet + ", owner=" + owner + "]";
	}

}
