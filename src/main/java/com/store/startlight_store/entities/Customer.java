package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="customer")
public class Customer extends People{

	@Column(name = "street")
	@NotBlank(message = "Thiếu street rồi")
	private String street;
	
	@Column(name = "distric")
	@NotBlank(message = "Thiếu distric rồi")
	private String distric;
	
	@Column(name = "city")
	@NotBlank(message = "Thiếu city rồi")
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
