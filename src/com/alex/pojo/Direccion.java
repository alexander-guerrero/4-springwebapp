package com.alex.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Direccion {
	
	private String calle;
	private String cp;
	
	public Direccion() {
		
	}

	// Pasar valores por par�metros del m�todo Constructor
	// @Autowired
	public Direccion(/*@Value("Calle Constructor")*/ String calle, /*@Value("1111")*/ String cp) {
		this.calle = calle;
		this.cp = cp;
	}
	
	//Pasar valores por par�metros de los m�todos Setters
	@Autowired
	public void setCalle(@Value("Calle Setter") String calle) {
		this.calle = calle;
	}

	@Autowired
	public void setCp(@Value("2222") String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", cp=" + cp + "]";
	}

}
