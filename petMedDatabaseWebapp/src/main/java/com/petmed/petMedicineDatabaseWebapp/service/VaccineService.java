package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petmed.petMedicineDatabaseWebapp.dao.VaccineDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Vaccine;

@Service
public class VaccineService {

	@Autowired
	VaccineDao vaccineDao;
	
	@Transactional
	public List<Vaccine> getVaccines() {
		return vaccineDao.getVaccineList();
	}

	
	@Transactional
	public void saveVaccine(Vaccine newVaccine) {
		vaccineDao.saveVaccine(newVaccine);
	}

	@Transactional
	public Vaccine getVaccine(int theId) {
		return vaccineDao.getVaccine(theId);
	}

}
