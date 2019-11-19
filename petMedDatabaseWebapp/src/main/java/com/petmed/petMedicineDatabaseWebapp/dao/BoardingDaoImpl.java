package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Boarding;

@Repository
public class BoardingDaoImpl extends AbstractDao<Integer, Boarding> implements BoardingDao {

	@Override
	public Boarding getBoarding(int theId) {
		return getByKey(theId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Boarding> getBoardings() {
		Criteria criteria = createEntityCriteria();
		return (List<Boarding>) criteria.list();
	}

	@Override
	public void saveBoarding(Boarding newBoarding) {
		save(newBoarding);
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

}
