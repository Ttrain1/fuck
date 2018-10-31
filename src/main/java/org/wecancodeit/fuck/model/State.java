package org.wecancodeit.fuck.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class State {
	
	private String abbreviation;
	private String name;
	private String motto;
	private Fish fish;
	private String citiesURl;
	
	@Id
	@GeneratedValue
	private Long id;
	public State(String abbreviation, String name, String motto, Fish fish, String citiesURl) {
		this.abbreviation = abbreviation;
		this.name = name;
		this.motto = motto;
		this.fish = fish;
		this.citiesURl = citiesURl;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public String getName() {
		return name;
	}
	public String getMotto() {
		return motto;
	}
	public Fish getFish() {
		return fish;
	}
	public String getCitiesURl() {
		return citiesURl;
	}
	public Long getId() {
		return id;
	}
}
