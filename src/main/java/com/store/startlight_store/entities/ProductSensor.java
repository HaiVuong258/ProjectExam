package com.store.startlight_store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProductSensor")
public class ProductSensor {

	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Description", columnDefinition = "varchar(50) not null")
	private String description;

	@ManyToMany(mappedBy = "sensor")
	private List<Product> sensorPhone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getSensorPhone() {
		return sensorPhone;
	}

	public void setSensorPhone(List<Product> sensorPhone) {
		this.sensorPhone = sensorPhone;
	}

	public ProductSensor(String id, String description, List<Product> sensorPhone) {
		super();
		this.id = id;
		this.description = description;
		this.sensorPhone = sensorPhone;
	}

	public ProductSensor() {
		super();
		this.id = "";
		this.description = "";
		this.sensorPhone = new ArrayList<Product>();
	}
}
