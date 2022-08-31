package com.bolsadeideas.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;




@Controller 
public class IndexController {
	@Autowired
	@Qualifier("miServicioComplejo") 
	private IServicio servicio;
	@GetMapping({"/","", "/index"})
	public String index(Model model) {
		model.addAttribute("operaciones",servicio.operaciones());
		return "index";
	}
}
