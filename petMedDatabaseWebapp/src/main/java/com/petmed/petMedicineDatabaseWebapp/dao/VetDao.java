package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

public interface VetDao {

	void saveVet(Vet newVet);

	Vet getVet(int id);

	List<Vet> getVets();


}
