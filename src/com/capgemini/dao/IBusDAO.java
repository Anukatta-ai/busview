package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Bus;

//IBusDAO is interface which has methods implemented on data base
public interface IBusDAO {

	public List<Bus> readAllBusDetails();

}
