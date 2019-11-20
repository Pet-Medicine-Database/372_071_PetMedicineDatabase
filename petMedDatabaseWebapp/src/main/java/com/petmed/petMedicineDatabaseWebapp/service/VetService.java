package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.dao.VetDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

@Service
public class VetService {
	
	@Autowired
	VetDao vetDao;
	
	public void saveVet(Vet newVet) {
		vetDao.saveVet(newVet);
	}
	
	public Vet getVet(int id) {
		return vetDao.getVet(id);
	}
	
	public List<Vet> getVets(){
		return vetDao.getVets();
	}

}
