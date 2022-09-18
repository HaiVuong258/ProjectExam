package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductROM")
public class ProductROM {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	@Column(name = "Amount", columnDefinition = "decimal(8,1) not null")
	private Double amount;

	@Column(name = "Slot", columnDefinition = "int not null")
	private Integer slot;

	@Column(name = "Optane", columnDefinition = "boolean not null")
	private boolean optane;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public boolean isOptane() {
		return optane;
	}

	public void setOptane(boolean optane) {
		this.optane = optane;
	}

	public ProductROM(String id, String type, Double amount, Integer slot, boolean optane) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.slot = slot;
		this.optane = optane;
	}

	public ProductROM() {
		super();
		this.id = "";
		this.type = "";
		this.amount = 0.0;
		this.slot = 0;
		this.optane = false;
	}
}
