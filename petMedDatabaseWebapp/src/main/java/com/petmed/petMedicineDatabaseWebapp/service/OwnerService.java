package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petmed.petMedicineDatabaseWebapp.dao.OwnerDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;

@Service
public class OwnerService {

	@Autowired
	OwnerDao ownerDao;
	
	@Transactional
	public List<Owner> getOwners() {
		return ownerDao.getOwnerList();
	}

	@Transactional
	public void saveOwner(Owner newOwner) {
		ownerDao.saveOwner(newOwner);
	}

	@Transactional
	public Owner getOwner(int theId) {
		return ownerDao.getOwner(theId);
	}

}
