package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductSim")
public class ProductSim {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "PhysicalSim", columnDefinition = "varchar(15) not null")
	private String physicalSim;

	@Column(name = "VirtualSim", columnDefinition = "varchar(15) not null")
	private String virtualSim;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhysicalSim() {
		return physicalSim;
	}

	public void setPhysicalSim(String physicalSim) {
		this.physicalSim = physicalSim;
	}

	public String getVirtualSim() {
		return virtualSim;
	}

	public void setVirtualSim(String virtualSim) {
		this.virtualSim = virtualSim;
	}

	public ProductSim(String id, String physicalSim, String virtualSim) {
		super();
		this.id = id;
		this.physicalSim = physicalSim;
		this.virtualSim = virtualSim;
	}

	public ProductSim() {
		super();
		this.id = "";
		this.physicalSim = "";
		this.virtualSim = "";
	}
}
