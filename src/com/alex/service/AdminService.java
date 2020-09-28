package com.alex.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.dao.AdminDao;
import com.alex.pojo.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;

	public void save(Admin admin) {
		// Setear fecha de creación
		admin.setFechaCreacion(new Timestamp(new Date().getTime()));
		adminDao.save(admin);
	}

	public List<Admin> findAll() {
		return adminDao.findAll();
	}

	public Admin findById(int id) {
		return adminDao.findById(id);
	}

	public void saveOrUpdate(Admin admin) {
		if (admin.getIdAdm() == 0) {
			// Setear fecha de creación
			admin.setFechaCreacion(new Timestamp(new Date().getTime()));
			// Crea el registro (INSERT)
			adminDao.save(admin);
		} else {
			// Modifica el registro (UPDATE)
			adminDao.update(admin);
		}
	}

	public void delete(int id) {
		adminDao.delete(id);
	}

}
