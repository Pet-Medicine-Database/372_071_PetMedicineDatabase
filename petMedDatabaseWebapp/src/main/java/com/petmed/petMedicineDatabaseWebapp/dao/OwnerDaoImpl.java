package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Owner;

@Repository
public class OwnerDaoImpl extends AbstractDao<Integer, Owner>implements OwnerDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Owner> getOwnerList() {
		Criteria criteria = createEntityCriteria();
		return (List<Owner>) criteria.list();
	}

	@Override
	public void saveOwner(Owner newOwner) {
		save(newOwner);
	}

	@Override
	public Owner getOwner(int theId) {
		return getByKey(theId);
	}

}
