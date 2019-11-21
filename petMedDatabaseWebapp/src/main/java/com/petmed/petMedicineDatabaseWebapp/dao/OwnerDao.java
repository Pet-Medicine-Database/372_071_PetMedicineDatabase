package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Owner;

public interface OwnerDao {

	List<Owner> getOwnerList();

	void saveOwner(Owner newOwner);

	Owner getOwner(long theId);
	
}
