package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.dao.VaccineDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Vaccine;

@Service
public class VaccineService {

	@Autowired
	VaccineDao vaccineDao;
	
	public List<Vaccine> getVaccines() {
		return vaccineDao.getVaccineList();
	}

	
	//save the vaccine I gave you.
	public void saveVaccine(Vaccine newVaccine) {
		vaccineDao.saveVaccine(newVaccine);
	}


	//return the vaccine with given Id
	public Vaccine getVaccine(int theId) {
		return vaccineDao.getVaccine(theId);
	}

}
