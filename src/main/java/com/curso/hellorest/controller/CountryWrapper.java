package com.curso.hellorest.controller;

import java.io.Serializable;
import java.util.List;

import com.curso.hellorest.component.Country;

public class CountryWrapper implements Serializable {

	private static final long serialVersionUID = 4665404846875454096L;

	private List<Country> countries;

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
}
