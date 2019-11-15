package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.entity.Vet;
import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;

@Service
public class AnimalService {
	
	public List<Animal> getAnimals(){
		return null;
	}
	
	public Animal getAnimal(int animalId) {
		return null;
	}

	public void saveAnimal(Animal newAnimal) {
		// TODO Auto-generated method stub
		
	}

	public LinkedHashMap<String, Owner> getOwners() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vet getVets() {
		// TODO Auto-generated method stub
		return null;
	}

	public LinkedHashMap<Owner, String> getOwnersAsKeyValuePair() {
		//icini doldur bana gonder abi
		LinkedHashMap<Owner,String> ownerList = new LinkedHashMap<Owner, String>();
		return ownerList;
	}

	public LinkedHashMap<Vet, String> getVetsAsKeyValuePair() {
		// TODO Auto-generated method stub
		//icini doldur bana gonder abi
		LinkedHashMap<Vet,String> vetList = new LinkedHashMap<Vet, String>();
		return vetList;
	}


	

}
