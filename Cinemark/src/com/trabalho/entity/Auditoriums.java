package com.trabalho.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Auditoriums {
	
	public List<Auditorium> auditorium;

	public List<Auditorium> getAuditorium() {
		return auditorium;
	}

	public void setAuditorium(List<Auditorium> auditorium) {
		this.auditorium = auditorium;
	}

}
