package com.alex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.dao.AdminDao;
import com.alex.dao.DireccionDao;
import com.alex.pojo.Admin;
import com.alex.pojo.Direccion;

@Service
public class DireccionService {
	
	@Autowired
	private DireccionDao direccionDao;
	
	@Autowired
	private AdminDao adminDao;
	
	public void save(Direccion direccion, Admin admin) {
		
	}
	
	public List<Direccion> findAll() {
		return null;
	}

}
