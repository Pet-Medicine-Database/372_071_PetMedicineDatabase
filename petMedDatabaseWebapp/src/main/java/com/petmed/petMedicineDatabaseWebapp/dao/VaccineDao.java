package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Vaccine;

public interface VaccineDao {

	List<Vaccine> getVaccineList();

	void saveVaccine(Vaccine newVaccine);

	Vaccine getVaccine(int theId);

}
