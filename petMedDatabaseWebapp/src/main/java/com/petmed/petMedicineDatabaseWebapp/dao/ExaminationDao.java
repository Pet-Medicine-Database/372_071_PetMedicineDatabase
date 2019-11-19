package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Examination;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

public interface ExaminationDao {

	public Examination getExamination(int appointmentId);
	
	public void saveExamination(Examination newExamination);
	
	public List<Examination> getExaminations();
	
	public List<Animal> getAnimalList();
	
	public List<Vet> getVetList();
	
	
}
