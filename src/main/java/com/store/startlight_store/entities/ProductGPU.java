package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductGPU")
public class ProductGPU {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Brand", columnDefinition = "varchar(15) not null")
	private String brand;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	@Column(name = "Model", columnDefinition = "varchar(15) not null")
	private String model;

	@Column(name = "Memory", columnDefinition = "decimal(5,1) null")
	private Double memory;

	@Column(name = "MemoryType", columnDefinition = "varchar(15) not null")
	private String memoryType;

	@Column(name = "RayTracing", columnDefinition = "boolean not null")
	private boolean rayTracing;
	
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getMemory() {
		return memory;
	}

	public void setMemory(Double memory) {
		this.memory = memory;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public boolean isRayTracing() {
		return rayTracing;
	}

	public void setRayTracing(boolean rayTracing) {
		this.rayTracing = rayTracing;
	}
	
	public ProductGPU(String id, String brand, String type, String model, Double memory, String memoryType,
			boolean rayTracing) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.model = model;
		this.memory = memory;
		this.memoryType = memoryType;
		this.rayTracing = rayTracing;
	}

	public ProductGPU() {
		super();
		this.id  = "";
		this.brand  = "";
		this.type  = "";
		this.model  = "";
		this.memory = 0.0;
		this.memoryType  = "";
		this.rayTracing  = false;
	}
}
