package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductConnection")
public class ProductConnection {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Data", columnDefinition = "varchar(15) not null")
	private String data;

	@Column(name = "Wifi", columnDefinition = "varchar(15) not null")
	private String wifi;

	@Column(name = "Bluetooth", columnDefinition = "varchar(15) not null")
	private String bluetooth;
	
	@Column(name = "GPS", columnDefinition = "boolean not null")
	private boolean gps;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public ProductConnection(String id, String data, String wifi, String bluetooth, boolean gps) {
		super();
		this.id = id;
		this.data = data;
		this.wifi = wifi;
		this.bluetooth = bluetooth;
		this.gps = gps;
	}
	

	public ProductConnection() {
		super();
		this.id = "";
		this.data = "";
		this.wifi = "";
		this.bluetooth = "";
		this.gps = false;
	}
}
