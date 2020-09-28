package com.alex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.pojo.Admin;
import com.alex.service.AdminService;

@Controller
//@SessionAttributes({"txtAbout", "txtAdmin"}) //Variables de sesión
//@SessionAttributes("txtAbout")
public class IndexController {

	@Autowired
	AdminService adminService;

	@RequestMapping("/")
	public String showIndex(@ModelAttribute("resultado") String res, Model model) {
		
		// Agrega al Modelo el Flash Attribute pasado por parámetro
		model.addAttribute("respuesta", res);

		// Lista de objetos Admin
		List<Admin> admins = adminService.findAll();
		// Agrega al Modelo la lista de objetos Admin
		model.addAttribute("adminLista", admins);

		return "index";
	}

	@RequestMapping("/about")
	public String showAbout(Model model) {
//		model.addAttribute("txtAbout", "Hola desde el Model con SessionAttributes :)");
		return "about";
	}

}
