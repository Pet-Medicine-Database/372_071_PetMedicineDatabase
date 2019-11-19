package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Boarding;

public interface BoardingDao {
	
	public Boarding getBoarding(int theId);
	
	public List<Boarding> getBoardings();
	
	public void saveBoarding(Boarding newBoarding);

	public List<Animal> getAnimalList();
	

}
