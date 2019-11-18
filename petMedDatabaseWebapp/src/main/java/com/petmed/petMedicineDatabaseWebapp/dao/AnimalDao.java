package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

public interface AnimalDao {

	Animal getAnimal(int animalId);
	
	void saveAnimal(Animal animal);

	void deleteAnimal(int animalId);
	
	List<Animal> getAnimalList();
	
	List<Owner> getOwnerList();
	
	List<Vet> getVetList();
}
