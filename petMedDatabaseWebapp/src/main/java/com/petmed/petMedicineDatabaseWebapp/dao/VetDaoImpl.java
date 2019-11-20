package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

@Repository
public class VetDaoImpl extends AbstractDao<Integer, Vet> implements VetDao {

	@Override
	public void saveVet(Vet newVet) {
		save(newVet);
	}

	@Override
	public Vet getVet(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vet> getVets() {
		Criteria criteria = createEntityCriteria();
		return (List<Vet>) criteria.list();
	}

}
