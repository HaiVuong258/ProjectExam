package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCommunicationPort")
public class ProductCommunicationPort {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;
	
	@Column(name = "HDMI", columnDefinition = "int not null")
	private Integer hdmi;

	@Column(name = "Thunderbolt", columnDefinition = "int not null")
	private Integer thunderbolt;

	@Column(name = "USB_A2", columnDefinition = "int not null")
	private Integer usbA2;

	@Column(name = "USB_A3", columnDefinition = "int not null")
	private Integer usbA3;

	@Column(name = "USB_C", columnDefinition = "int not null")
	private Integer usbC;

	@Column(name = "Jack35", columnDefinition = "int not null")
	private Integer jack35;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getHdmi() {
		return hdmi;
	}

	public void setHdmi(Integer hdmi) {
		this.hdmi = hdmi;
	}

	public Integer getThunderbolt() {
		return thunderbolt;
	}

	public void setThunderbolt(Integer thunderbolt) {
		this.thunderbolt = thunderbolt;
	}

	public Integer getUsbA2() {
		return usbA2;
	}

	public void setUsbA2(Integer usbA2) {
		this.usbA2 = usbA2;
	}

	public Integer getUsbA3() {
		return usbA3;
	}

	public void setUsbA3(Integer usbA3) {
		this.usbA3 = usbA3;
	}

	public Integer getUsbC() {
		return usbC;
	}

	public void setUsbC(Integer usbC) {
		this.usbC = usbC;
	}

	public Integer getJack35() {
		return jack35;
	}

	public void setJack35(Integer jack35) {
		this.jack35 = jack35;
	}

	public ProductCommunicationPort(String id, Integer hdmi, Integer thunderbolt, Integer usbA2, Integer usbA3,
			Integer usbC, Integer jack35) {
		super();
		this.id = id;
		this.hdmi = hdmi;
		this.thunderbolt = thunderbolt;
		this.usbA2 = usbA2;
		this.usbA3 = usbA3;
		this.usbC = usbC;
		this.jack35 = jack35;
	}
	

	public ProductCommunicationPort() {
		super();
		this.id = "";
		this.hdmi = 0;
		this.thunderbolt = 0;
		this.usbA2 = 0;
		this.usbA3 = 0;
		this.usbC = 0;
		this.jack35 = 0;
	}
}
