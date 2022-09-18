package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCPU")
public class ProductCPU {

	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Brand", columnDefinition = "varchar(15) not null")
	private String brand;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	@Column(name = "Model", columnDefinition = "varchar(15) not null")
	private String model;

	@Column(name = "BaseSpeed", columnDefinition = "decimal(5,1) not null")
	private Double baseSpeed;

	@Column(name = "MaxSpeed", columnDefinition = "decimal(5,1) not null")
	private Double maxSpeed;

	@Column(name = "Core", columnDefinition = "int not null")
	private Integer core;

	@Column(name = "Thread", columnDefinition = "int not null")
	private Integer thread;

	@Column(name = "Cache", columnDefinition = "int not null")
	private Integer cache;

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

	public Double getBaseSpeed() {
		return baseSpeed;
	}

	public void setBaseSpeed(Double baseSpeed) {
		this.baseSpeed = baseSpeed;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getCore() {
		return core;
	}

	public void setCore(Integer core) {
		this.core = core;
	}

	public Integer getThread() {
		return thread;
	}

	public void setThread(Integer thread) {
		this.thread = thread;
	}

	public Integer getCache() {
		return cache;
	}

	public void setCache(Integer cache) {
		this.cache = cache;
	}
	
	

	public ProductCPU(String id, String brand, String type, String model, Double baseSpeed, Double maxSpeed,
			Integer core, Integer thread, Integer cache) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.model = model;
		this.baseSpeed = baseSpeed;
		this.maxSpeed = maxSpeed;
		this.core = core;
		this.thread = thread;
		this.cache = cache;
	}

	public ProductCPU() {
		super();
		this.id  = "";
		this.brand  = "";
		this.type  = "";
		this.model  = "";
		this.baseSpeed  = 0.0;
		this.maxSpeed  = 0.0;
		this.core  = 0;
		this.thread  = 0;
		this.cache  = 0;
	}
}
