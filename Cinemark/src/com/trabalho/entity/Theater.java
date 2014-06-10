package com.trabalho.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Theater {
	
	@XmlAttribute
	public String id;
	public String name;
	public Address address;
	public String notes;
	public City city;
	public String prices;
	
	@XmlElementWrapper(name="auditoriums")
	@XmlElement(name="auditorium")
	public List<Auditorium> auditoriums;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getPrices() {
		return prices;
	}
	public void setPrices(String prices) {
		this.prices = prices;
	}
	
	public List<Auditorium> getAuditoriums() {
		return auditoriums;
	}

	public void setAuditorium(List<Auditorium> auditoriums) {
		this.auditoriums = auditoriums;
	}
	
	
	

}
