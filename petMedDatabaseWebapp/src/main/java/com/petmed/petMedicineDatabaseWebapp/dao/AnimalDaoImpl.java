package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Animal;
import com.petmed.petMedicineDatabaseWebapp.entity.Owner;
import com.petmed.petMedicineDatabaseWebapp.entity.Vet;

@Repository
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
		String hql = "from Animal";
		System.out.println("HELLO WORLD!");
		Query<Animal> query = getSession().createQuery(hql,Animal.class);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

	@Override
	public List<Owner> getOwnerList() {
		String hql = "from Owner";
		@SuppressWarnings("rawtypes")
		Query query = getSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Owner> result = query.list();
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
	
}
