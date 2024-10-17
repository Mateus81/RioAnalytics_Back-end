package com.country.paises.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.country.paises.service.PaisService;

@RestController
@CrossOrigin("*")
public class PaisController {
	// Chamando service e inicializando pelo Autowired
	@Autowired
	private PaisService service;
	
	@GetMapping("/countries")
	public String getCountries(){
		return service.getCountries();
	}
	
}
