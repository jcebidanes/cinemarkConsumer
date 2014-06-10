package com.trabalho.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Film {
	
	@XmlAttribute public String id;
	@XmlAttribute public String genre;
	@XmlAttribute(name="parent-guide-rating") public String parentGuideRating;
	@XmlAttribute public String n;
	@XmlAttribute(name="media-3d") public String media3d;
	@XmlAttribute(name="media-35mm") public String media35mm;
	@XmlAttribute public String trailer;
	@XmlAttribute public String top;
	@XmlAttribute(name="first-print") public String firstPrint;
	@XmlAttribute public String runtime;
	@XmlAttribute public String screens;
	@XmlAttribute public String showtimes;
	@XmlAttribute public String distributor;
	
	@XmlValue
	public String value;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getParentGuideRating() {
		return parentGuideRating;
	}

	public void setParentGuideRating(String parentGuideRating) {
		this.parentGuideRating = parentGuideRating;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getMedia3d() {
		return media3d;
	}

	public void setMedia3d(String media3d) {
		this.media3d = media3d;
	}

	public String getMedia35mm() {
		return media35mm;
	}

	public void setMedia35mm(String media35mm) {
		this.media35mm = media35mm;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getFirstPrint() {
		return firstPrint;
	}

	public void setFirstPrint(String firstPrint) {
		this.firstPrint = firstPrint;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getScreens() {
		return screens;
	}

	public void setScreens(String screens) {
		this.screens = screens;
	}

	public String getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(String showtimes) {
		this.showtimes = showtimes;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
