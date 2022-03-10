package com.curso.hellorest.component;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="country_tbl")
@Component
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2262536658460043330L;

	@Id	
	@Column(name="Country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;

	@Column(name="Country_name")
	private String cname;

	@Column(name="Country_population")
	private long cpopulation;

	public Country() { }

	public Country(int cid, String cname, long cpopulation) {	
		this.cid = cid;
		this.cname = cname;
		this.cpopulation = cpopulation;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCpopulation() {
		return cpopulation;
	}
	public void setCpopulation(long cpopulation) {
		this.cpopulation = cpopulation;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", cpopulation=" + cpopulation + "]";
	}
}