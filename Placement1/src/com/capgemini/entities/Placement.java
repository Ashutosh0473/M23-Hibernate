package com.capgemini.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


    @Entity
	@Table(name="Placement")
	public class Placement {
	@Id
	private int id;
	private String name;
	private LocalDate Localdate;
	private String qualification;
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="collegename")
	private College clg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLocaldate() {
		return Localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		Localdate = localdate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}


	
	
}
