package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.entity.Vet;
import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.entity.Examination;

@Service
public class ExaminationService {
	
	public Examination getExamination(int appointmentId) {
		return null;
	}

	public void saveExamination(Examination newExamination) {
		// TODO Auto-generated method stub
		
	}
	
	public LinkedHashMap<String, Animal> getAnimals() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vet getVets() {
		// TODO Auto-generated method stub
		return null;
	}

	public LinkedHashMap<Animal, String> getAnimalsAsKeyValuePair() {
		//icini doldur bana gonder abi
		LinkedHashMap<Animal,String> animalList = new LinkedHashMap<Animal, String>();
		return animalList;
	}

	public LinkedHashMap<Vet, String> getVetsAsKeyValuePair() {
		// TODO Auto-generated method stub
		//icini doldur bana gonder abi
		LinkedHashMap<Vet,String> vetList = new LinkedHashMap<Vet, String>();
		return vetList;
	}

	public List<Examination> getExaminations() {
		// TODO Auto-generated method stub
		return null;
	}

	 

	

}
