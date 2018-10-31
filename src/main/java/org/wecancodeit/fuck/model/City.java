package org.wecancodeit.fuck.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class City {

	private String name;
	private String population;
	
	@GeneratedValue
	@Id
	private Long id;

	public City(String name, String population) {
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public String getPopulation() {
		return population;
	}

	public Long getId() {
		return id;
	}
	
	
}
