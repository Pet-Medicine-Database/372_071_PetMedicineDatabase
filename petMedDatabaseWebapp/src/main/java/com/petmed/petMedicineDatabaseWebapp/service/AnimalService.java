package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.entity.Vet;
import com.petmed.petMedicineDatabaseWebapp.dao.AnimalDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;

@Service
public class AnimalService {
	
	AnimalDao animalDao;
	
	public List<Animal> getAnimals(){
		return animalDao.getAnimalList();
	}
	
	public Animal getAnimal(int animalId) {
		return animalDao.getAnimal(animalId);
	}

	public void saveAnimal(Animal newAnimal) {
		animalDao.saveAnimal(newAnimal);
	}

	public LinkedHashMap<Owner, String> getOwnersAsKeyValuePair() {
		List<Owner> ownerList=animalDao.getOwnerList();
		LinkedHashMap<Owner, String> mappedList = null;
		Iterator<Owner> i=ownerList.iterator();
		while(i.hasNext()) {
			Owner owner=(Owner) i.next();
			mappedList.put(owner,owner.getName());	
		}
		return mappedList;
	}

	public LinkedHashMap <Vet, String> getVetsAsKeyValuePair() {
		List<Vet> vetList=animalDao.getVetList();
		LinkedHashMap<Vet,String> mappedList = null;
		Iterator<Vet> i=vetList.iterator();
		while(i.hasNext()) {
			Vet vet=(Vet) i.next();
			mappedList.put(vet, vet.getName());	
		}
		return mappedList;
	}
	

}
