package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Bus;

@Repository(value="dao")
//BusDAOImpl class implements the methods in IBusDAO interface
public class BusDAOImpl implements IBusDAO{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	//readAllBusDetails retrieve all bus details available
	public List<Bus> readAllBusDetails() {
		TypedQuery<Bus> tquery= entityManager.createQuery("From Bus", Bus.class);
		List<Bus> list= tquery.getResultList();
		return list;
	}

}
