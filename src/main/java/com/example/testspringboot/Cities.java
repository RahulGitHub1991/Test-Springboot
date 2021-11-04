package com.example.testspringboot;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JacksonXmlRootElement
public class Cities implements Serializable {

	private static final long serialVersionUID = 22L;

	@JacksonXmlProperty(localName = "City")
	@JacksonXmlElementWrapper(useWrapping = false)
	private Set<City> cities = new HashSet<City>();

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
}
