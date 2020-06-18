package com.beer.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Beer {
	@XmlElement(required=true)
	private String name;
	
	 @XmlElement(required=true)
	private String type;
	
	 @XmlElement(required=true)
	private String brand;
	
	 @XmlElement(required=true)
	private String countryCode;
	
	 @XmlElement(required=true)
	private double ibu;
	
	@XmlElement(required=true)
	private double alcoholVolume;
	
	@XmlElement(required=false)
	private String id;
	
	public Beer(
			String name,
			String type,
			String brand,
			String countryCode,
			double ibu,
			double alcoholVolume,
			String id
	) {
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.countryCode = countryCode;
		this.ibu = ibu;
		this.alcoholVolume = alcoholVolume;
		
		if(id != null) this.id = id;
	}
	
	public Beer() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public double getIbu() {
		return ibu;
	}

	public void setIbu(double ibu) {
		this.ibu = ibu;
	}

	public double getAlcoholVolume() {
		return alcoholVolume;
	}

	public void setAlcoholVolume(double alcoholVolume) {
		this.alcoholVolume = alcoholVolume;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Beer [name=" + name + ", type=" + type + ", brand=" + brand + ", countryCode=" + countryCode + ", ibu="
				+ ibu + ", alcoholVolume=" + alcoholVolume + ", id=" + id + "]";
	}
}
