package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.IBusDAO;
import com.capgemini.model.Bus;

@Service(value="service")
//BusServiceImpl class implements the methods of IBusService interface
public class BusServiceImpl implements IBusService{

	@Autowired
	IBusDAO dao;

	@Override
	public List<Bus> showBusDetails() {
		return dao.readAllBusDetails();
	}
}
