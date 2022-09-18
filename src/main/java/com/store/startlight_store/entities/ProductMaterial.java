package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductMaterial")
public class ProductMaterial {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "FrameMaterial", columnDefinition = "varchar(15) not null")
	private String frameMaterial;

	@Column(name = "CoverMaterial", columnDefinition = "varchar(15) not null")
	private String coverMaterial;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

	public String getCoverMaterial() {
		return coverMaterial;
	}

	public void setCoverMaterial(String coverMaterial) {
		this.coverMaterial = coverMaterial;
	}

	public ProductMaterial() {
		super();
		this.id = "";
		this.frameMaterial = "";
		this.coverMaterial = "";
	}
	

	public ProductMaterial(String id, String frameMaterial, String coverMaterial) {
		super();
		this.id = id;
		this.frameMaterial = frameMaterial;
		this.coverMaterial = coverMaterial;
	}
}
