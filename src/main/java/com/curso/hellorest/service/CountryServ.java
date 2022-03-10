package com.curso.hellorest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.hellorest.component.Country;
import com.curso.hellorest.repository.CountryDao;

@Service
public class CountryServ {

	@Autowired
	private CountryDao cdao;

	public List<Country> getAllCountries() {
		return cdao.getAllCountries();
	}

	@Transactional
	public Country getCountry(int id) {
		return cdao.getCountry(id);
	}

	@Transactional
	public List<Country> saveCountries(List<Country> countries) {
		List<Country> countriesSaved = new ArrayList<Country>();
		try {
			for (Country c : countries) {
				Country saved = cdao.saveCountry(c);
				countriesSaved.add(saved);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return countriesSaved;
	}	
}