package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petmed.petMedicineDatabaseWebapp.entity.Vet;
import com.petmed.petMedicineDatabaseWebapp.dao.ExaminationDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.entity.Examination;

@Service
public class ExaminationService {
	
	@Autowired
	ExaminationDao examinationDao;
	
	@Transactional
	public Examination getExamination(int appointmentId) {
		return examinationDao.getExamination(appointmentId);
	}

	@Transactional
	public void saveExamination(Examination newExamination) {
		examinationDao.saveExamination(newExamination);
		
	}
	
	@Transactional
	public LinkedHashMap<Animal, String> getAnimalsAsKeyValuePair() {
		List<Animal> animalList=examinationDao.getAnimalList();
		LinkedHashMap<Animal,String> mappedList = new LinkedHashMap<Animal, String>();
		Iterator<Animal> i=animalList.iterator();
		while(i.hasNext()) {
			Animal animal=(Animal) i.next();
			mappedList.put(animal, animal.getName());	
		}
		return mappedList;
	}

	@Transactional
	public LinkedHashMap<Vet, String> getVetsAsKeyValuePair() {
		List<Vet> vetList=examinationDao.getVetList();
		LinkedHashMap<Vet,String> mappedList = new LinkedHashMap<Vet, String>();
		Iterator<Vet> i=vetList.iterator();
		while(i.hasNext()) {
			Vet vet=(Vet) i.next();
			mappedList.put(vet, vet.getName());	
		}
		return mappedList;
	}

	@Transactional
	public List<Examination> getExaminations() {
		return examinationDao.getExaminations();
	}

	 

	

}
