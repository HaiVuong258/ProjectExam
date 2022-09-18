package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductRAM")
public class ProductRAM {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	@Column(name = "Amount", columnDefinition = "decimal(5,1) not null")
	private Double amount; // tổng dung lượng RAM

	@Column(name = "Slot", columnDefinition = "int not null")
	private Integer slot; // số lượng khe RAM

	@Column(name = "Onboard", columnDefinition = "int not null")
	private Integer onboard; // số khe RAM không thể tháo rời 

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

	public Integer getOnboard() {
		return onboard;
	}

	public void setOnboard(Integer onboard) {
		this.onboard = onboard;
	}

	public ProductRAM(String id, String type, Double amount, Integer slot, Integer onboard) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.slot = slot;
		this.onboard = onboard;
	}

	public ProductRAM() {
		super();
		this.id = "";
		this.type = "";
		this.amount = 0.0;
		this.slot = 0;
		this.onboard = 0;
	}
}
