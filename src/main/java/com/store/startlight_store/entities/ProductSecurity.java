package com.store.startlight_store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProductSecurity")
public class ProductSecurity {

	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Description", columnDefinition = "varchar(150) not null")
	private String description;
	
	@ManyToMany(mappedBy = "security")
	private List<Product> securityPhone;

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

	public List<Product> getSecurityPhone() {
		return securityPhone;
	}

	public void setSecurityPhone(List<Product> securityPhone) {
		this.securityPhone = securityPhone;
	}

	public ProductSecurity(String id, String description, List<Product> securityPhone) {
		super();
		this.id = id;
		this.description = description;
		this.securityPhone = securityPhone;
	}

	public ProductSecurity() {
		super();
		this.id = "";
		this.description = "";
		this.securityPhone = new ArrayList<Product>();
	}
}
