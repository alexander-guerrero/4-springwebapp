package com.alex.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Admin")
public class Admin {

	@Id
	@GeneratedValue()
//	@Column(name = "id_admin")
	private int idAdm;
	
//	@Column(name = "nombre_completo")
	private String nombre;
	
	private String cargo;
	
	private Timestamp fechaCreacion;

	public Admin() {

	}

	public Admin(int idAdm, String nombre, String cargo, Timestamp fechaCreacion) {
		this.idAdm = idAdm;
		this.nombre = nombre;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
	}

	public Admin(String nombre, String cargo, Timestamp fechaCreacion) {
		this.nombre = nombre;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
	}

	public int getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(int idAdm) {
		this.idAdm = idAdm;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Administrador [idAdm=" + idAdm + ", nombre=" + nombre + ", cargo=" + cargo + ", fechaCreacion="
				+ fechaCreacion + "]";
	}

}
