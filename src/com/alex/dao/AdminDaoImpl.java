package com.alex.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alex.pojo.Admin;

@Transactional
@Repository
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Admin admin) {
		getSession().save(admin);
	}

	@Override
	public List<Admin> findAll() {
		// Consulta con HQL
		Query query = getSession().createQuery("from Admin"); // SQL: SELECT * FROM Admin
		return query.list();
		
		// Consulta con Criteria
//		Criteria criteria = getSession().createCriteria(Admin.class);
//		return criteria.list();
	}

	@Override
	public Admin findById(int id) {
		// Consulta con Criteria
		Criteria criteria = getSession().createCriteria(Admin.class);
		criteria.add(Restrictions.eq("idAdm", id));
		return (Admin) criteria.uniqueResult();
		
		// Consulta con HQL
//		Query query = getSession().createQuery("from Admin where idAdm = :idAdmin");
//		query.setParameter("idAdmin", id);
//		return (Admin) query.uniqueResult();
	}

	@Override
	public List<Admin> findByNombre(String nombre) {
		// Consulta con Criteria
		Criteria criteria = getSession().createCriteria(Admin.class);
		criteria.add(Restrictions.like("nombre", "%" + nombre + "%"));
		return criteria.list();
		
		// Consulta con HQL
//		Query query = getSession().createQuery("from Admin where nombre like :nombre");
//		query.setParameter("nombre", "%" + nombre + "%");
//		return query.list();
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
