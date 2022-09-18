package com.store.startlight_store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCamera")
public class ProductCamera {

	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Resolution", columnDefinition = "varchar(15) not null")
	private String resolution;

	@Column(name = "Aperture", columnDefinition = "varchar(15) not null")
	private String aperture;
	
	@ManyToMany(mappedBy = "frontCamera")
	private List<Product> frontCameraPhone;
	
	@ManyToMany(mappedBy = "selfieCamera")
	private List<Product> selfieCameraPhone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getAperture() {
		return aperture;
	}

	public void setAperture(String aperture) {
		this.aperture = aperture;
	}

	public List<Product> getFrontCameraPhone() {
		return frontCameraPhone;
	}

	public void setFrontCameraPhone(List<Product> frontCameraPhone) {
		this.frontCameraPhone = frontCameraPhone;
	}

	public List<Product> getSelfieCameraPhone() {
		return selfieCameraPhone;
	}

	public void setSelfieCameraPhone(List<Product> selfieCameraPhone) {
		this.selfieCameraPhone = selfieCameraPhone;
	}

	public ProductCamera(String id, String resolution, String aperture, List<Product> frontCameraPhone,
			List<Product> selfieCameraPhone) {
		super();
		this.id = id;
		this.resolution = resolution;
		this.aperture = aperture;
		this.frontCameraPhone = frontCameraPhone;
		this.selfieCameraPhone = selfieCameraPhone;
	}

	public ProductCamera() {
		super();
		this.id = "";
		this.resolution = "";
		this.aperture = "";
		this.frontCameraPhone = new ArrayList<Product>();
		this.selfieCameraPhone =  new ArrayList<Product>();
	}
}
