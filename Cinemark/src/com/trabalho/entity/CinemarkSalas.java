package com.trabalho.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cinemark")
@XmlAccessorType(XmlAccessType.FIELD)
public class CinemarkSalas {
	
	@XmlElement(name="theater")
	public List<Theater> theaters;

	public List<Theater> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theater> theaters) {
		this.theaters = theaters;
	}

}
