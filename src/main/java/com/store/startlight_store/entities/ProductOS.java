package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductOS")
public class ProductOS {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Brand", columnDefinition = "varchar(15) not null")
	private String brand;

	@Column(name = "Version", columnDefinition = "varchar(15) not null")
	private String version;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ProductOS(String id, String brand, String version, String type) {
		super();
		this.id = id;
		this.brand = brand;
		this.version = version;
		this.type = type;
	}

	public ProductOS() {
		super();
		this.id = "";
		this.brand = "";
		this.version = "";
		this.type = "";
	}
}
