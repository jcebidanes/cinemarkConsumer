package com.trabalho.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cinemark")
@XmlAccessorType(XmlAccessType.FIELD)
public class CinemarkFilmes {
	
	@XmlElementWrapper(name="films")
	@XmlElement(name="film")
	public List<Film> films;

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}


}
