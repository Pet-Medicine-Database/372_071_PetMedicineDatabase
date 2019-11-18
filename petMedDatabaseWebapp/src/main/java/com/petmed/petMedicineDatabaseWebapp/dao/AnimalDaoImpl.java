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
		persist(animal);
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

	@Override
	public void updateAnimal(int animalId) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> getAnimalList() {
		Criteria criteria = createEntityCriteria();
		return (List<Animal>) criteria.list();
	}

	@Override
	public List<Owner> getOwnerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vet> getVetList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
