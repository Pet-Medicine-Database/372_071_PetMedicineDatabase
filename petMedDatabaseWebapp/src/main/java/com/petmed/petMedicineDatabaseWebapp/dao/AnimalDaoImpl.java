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
		Criteria criteria = createEntityCriteria();
		return (List<Animal>) criteria.list();
	}

	//TODO OwnerDao ve VetDaodan metod cagrilacak
	@SuppressWarnings("unchecked")
	@Override
	public List<Owner> getOwnerList() {
		List<Owner> ownerList = null;
		return ownerList;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Vet> getVetList() {
		List<Vet> vetList= null;
		return vetList;
	}
	
}
