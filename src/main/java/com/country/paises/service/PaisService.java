package com.country.paises.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaisService {
	// Obtém países pela url do site
	public String getCountries() {
	RestTemplate restTemplate = new RestTemplate();
	String url = "https://restcountries.com/v3.1/all";
	return restTemplate.getForObject(url, String.class);
	}
}
