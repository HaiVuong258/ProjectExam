package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductSize")
public class ProductSize {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Length", columnDefinition = "decimal(8,1) not null")
	private Double length;

	@Column(name = "Width", columnDefinition = "decimal(8,1) not null")
	private Double width;

	@Column(name = "Thickness", columnDefinition = "decimal(5,1) not null")
	private Double thickness;

	@Column(name = "Weight", columnDefinition = "decimal(5,2) not null")
	private Double weight;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getThickness() {
		return thickness;
	}

	public void setThickness(Double thickness) {
		this.thickness = thickness;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public ProductSize(String id, Double length, Double width, Double thickness, Double weight) {
		super();
		this.id = id;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.weight = weight;
	}
	

	public ProductSize() {
		super();
		this.id = "";
		this.length = 0.0;
		this.width = 0.0;
		this.thickness = 0.0;
		this.weight = 0.0;
	}
}
