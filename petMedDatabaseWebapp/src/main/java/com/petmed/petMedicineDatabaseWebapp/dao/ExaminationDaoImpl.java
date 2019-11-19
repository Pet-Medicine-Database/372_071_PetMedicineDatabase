package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Examination;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;


@Repository
public class ExaminationDaoImpl extends AbstractDao<Integer, Examination> implements ExaminationDao {

	@Override
	public Examination getExamination(int appointmentId) {
		return getByKey(appointmentId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Examination> getExaminations() {
		Criteria criteria = createEntityCriteria();
		return (List<Examination>) criteria.list();
	}

	@Override
	public List<Animal> getAnimalList() {
		String hql = "from Animal";
		@SuppressWarnings("rawtypes")
		Query query = getSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Animal> result = query.list();
		return result;
	}

	@Override
	public List<Vet> getVetList() {
		String hql = "from Vet";
		@SuppressWarnings("rawtypes")
		Query query = getSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Vet> result = query.list();
		return result;
	}

	@Override
	public void saveExamination(Examination newExamination) {
		save(newExamination);
	}

}
