package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

public class AnimalDaoImpl extends AbstractDao<Integer, Animal> implements AnimalDao {
	
	@Override
	public void saveAnimal(Animal animal) {
		save(animal);
	}

	@Override
	public Animal getAnimal(int animalId) {
		return getByKey(animalId);
	}
	
	@SuppressWarnings("rawtypes") 
	@Override
	public void deleteAnimal(int animalId) {
		String hql="delete from Animal where id = :id";
		Query query = getSession().createSQLQuery(hql);
		query.setParameter("id", animalId);
		query.executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> getAnimalList() {
		Criteria criteria = createEntityCriteria();
		return (List<Animal>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Owner> getOwnerList() {
		String hql="select o from Owner as o,Animal as a where a.owner_tc_no=o.tc_no";
		@SuppressWarnings("rawtypes")
		Query query = getSession().createSQLQuery(hql);
		List<Owner> ownerList= query.list();
		
		return ownerList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Vet> getVetList() {
		String hql="select v from Vet as v,Animal as a where a.vet_tc_no=v.tc_no";
		@SuppressWarnings("rawtypes")
		Query query = getSession().createSQLQuery(hql);
		List<Vet> vetList= query.list();
		
		return vetList;
	}
	
}
