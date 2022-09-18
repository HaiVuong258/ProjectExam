package com.store.startlight_store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCameraFunction")
public class ProductCameraFunction {

	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Description", columnDefinition = "varchar(150) not null")
	private String description;
	
	@ManyToMany(mappedBy = "cameraFunction")
	private List<Product> cameraFunctionPhone;

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

	public List<Product> getCameraFunctionPhone() {
		return cameraFunctionPhone;
	}

	public void setCameraFunctionPhone(List<Product> cameraFunctionPhone) {
		this.cameraFunctionPhone = cameraFunctionPhone;
	}

	public ProductCameraFunction(String id, String description, List<Product> cameraFunctionPhone) {
		super();
		this.id = id;
		this.description = description;
		this.cameraFunctionPhone = cameraFunctionPhone;
	}

	public ProductCameraFunction() {
		super();
		this.id = "";
		this.description = "";
		this.cameraFunctionPhone = new ArrayList<Product>();
	}
}
