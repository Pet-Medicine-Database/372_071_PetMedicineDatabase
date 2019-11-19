package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.dao.BoardingDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Boarding;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

@Service
public class BoardingService {

	@Autowired
	private BoardingDao boardingDao;
	
	public Boarding getBoarding(int theId) {
		return boardingDao.getBoarding(theId);
	}

	public List<Boarding> getBoardings() {
		return boardingDao.getBoardings();
	}

	public LinkedHashMap<Animal, String> getAnimalsAsKeyValuePair() {
		List<Animal> animalList=boardingDao.getAnimalList();
		LinkedHashMap<Animal,String> mappedList = new LinkedHashMap<Animal, String>();
		Iterator<Animal> i=animalList.iterator();
		while(i.hasNext()) {
			Animal animal=(Animal) i.next();
			mappedList.put(animal, animal.getName());	
		}
		return mappedList;
	}

	public void saveBoarding(Boarding newBoarding) {
		boardingDao.saveBoarding(newBoarding);
	}

}
