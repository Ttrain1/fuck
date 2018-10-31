package org.wecancodeit.fuck.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Fish {
	
	private String name;
	private String binomialNomenclature;
	private String imgUrl;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Fish(String name, String binomialNomenclature, String imgUrl) {
		this.name = name;
		this.binomialNomenclature = binomialNomenclature;
		this.imgUrl = imgUrl;
	}
	
	public String getName() {
		return name;
	}
	public String getBinomialNomenclature() {
		return binomialNomenclature;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	
}
