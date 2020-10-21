package com.alex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alex.pojo.Direccion;
import com.alex.service.AdminService;
import com.alex.service.DireccionService;

@Controller
@SessionAttributes("admin") // Variable de sesión
public class DireccionController {
	
	@Autowired
	private DireccionService direccionService;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/direccion")
	public String handleDireccion(@ModelAttribute("direccion") Direccion dirForm) {
		System.out.println("dirForm: " + dirForm);
		
		return "direccion";
	}
	
	@RequestMapping("/direccion/{idAdmin}")
	public String handleDireccionAdmin(@PathVariable("idAdmin") int idAd, Model model) {
		System.out.println("idAd: " + idAd);
		// Agrega al Modelo el objeto Admin consultado (también se guarda en la sesión mediante @SessionAttributes)
		model.addAttribute("admin", adminService.findById(idAd));
		
		return "redirect:/direccion";
	}
	
}
