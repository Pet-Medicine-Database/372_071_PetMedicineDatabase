package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Vaccine;

@Repository
public class VaccineDaoImpl extends AbstractDao<Integer, Vaccine> implements VaccineDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Vaccine> getVaccineList() {
		Criteria criteria = createEntityCriteria();
		return (List<Vaccine>) criteria.list();
	}

	@Override
	public void saveVaccine(Vaccine newVaccine) {
		save(newVaccine);
	}

	@Override
	public Vaccine getVaccine(int theId) {
		return getByKey(theId);
	}

}
