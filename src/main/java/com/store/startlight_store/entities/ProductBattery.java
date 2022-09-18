package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductBattery")
public class ProductBattery {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;
	
	@Column(name = "PowerSupply", columnDefinition = "int not null")
	private Integer powerSupply;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	@Column(name = "Jack", columnDefinition = "varchar(30) not null")
	private String jack;

	@Column(name = "FastCharg", columnDefinition = "varchar(30) not null")
	private String fastCharg;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(Integer powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getJack() {
		return jack;
	}

	public void setJack(String jack) {
		this.jack = jack;
	}

	public String getFastCharg() {
		return fastCharg;
	}

	public void setFastCharg(String fastCharg) {
		this.fastCharg = fastCharg;
	}

	public ProductBattery(String id, Integer powerSupply, String type, String jack, String fastCharg) {
		super();
		this.id = id;
		this.powerSupply = powerSupply;
		this.type = type;
		this.jack = jack;
		this.fastCharg = fastCharg;
	}

	public ProductBattery() {
		super();
		this.id  = "";
		this.powerSupply = 0;
		this.type = "";
		this.jack = "";
		this.fastCharg = "";
	}
}
