package com.curso.hellorest.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.curso.hellorest.component.Country;

@Repository
public class CountryDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
    	Session session;
    	try {
    	    session = sessionFactory.getCurrentSession();
    	} catch (HibernateException e) {
    		//Session closed
    	    session = sessionFactory.openSession();
    	}
    	return session;

    }
	// Get all countries from the database	
	public List<Country> getAllCountries() {			
//		List<Country> countries = getTemplate().loadAll(Country.class);

		List<Country> countries = getSession().createCriteria(Country.class).list();

		for(Country c : countries)
			System.out.println(c.toString());

		return countries;
	}

	// Get country by id from the database
	public Country getCountry(int id) {		
		Country country = (Country) getSession().get(Country.class, id);
		return country;
	}

	public Country saveCountry(Country c) {
		try {
			getSession().save(c);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return c;
	}
}