package com.alex.dao;

import java.util.List;

import com.alex.pojo.Admin;
import com.alex.pojo.Direccion;

public interface DireccionDao {
	
	public void save(Direccion direccion);
	public List<Direccion> findAll();

}
