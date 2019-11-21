package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petmed.petMedicineDatabaseWebapp.dao.VetDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

@Service
public class VetService {
	
	@Autowired
	VetDao vetDao;
	
	@Transactional
	public void saveVet(Vet newVet) {
		vetDao.saveVet(newVet);
	}
	
	@Transactional
	public Vet getVet(int id) {
		return vetDao.getVet(id);
	}
	
	@Transactional
	public List<Vet> getVets(){
		return vetDao.getVets();
	}

}
