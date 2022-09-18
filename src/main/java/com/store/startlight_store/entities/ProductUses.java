package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductUses")
public class ProductUses {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "OfficeAndStudy", columnDefinition = "int not null")
	private Integer officeAndStudy;

	@Column(name = "GraphicDesign", columnDefinition = "int not null")
	private Integer graphicDesign;

	@Column(name = "Business", columnDefinition = "int not null")
	private Integer business;

	@Column(name = "Development", columnDefinition = "int not null")
	private Integer development;

	@Column(name = "Gaming", columnDefinition = "int not null")
	private Integer gaming;


	public Integer getOfficeAndStudy() {
		return officeAndStudy;
	}

	public void setOfficeAndStudy(Integer officeAndStudy) {
		this.officeAndStudy = officeAndStudy;
	}

	public Integer getGraphicDesign() {
		return graphicDesign;
	}

	public void setGraphicDesign(Integer graphicDesign) {
		this.graphicDesign = graphicDesign;
	}

	public Integer getBusiness() {
		return business;
	}

	public void setBusiness(Integer business) {
		this.business = business;
	}

	public Integer getDevelopment() {
		return development;
	}

	public void setDevelopment(Integer development) {
		this.development = development;
	}

	public Integer getGaming() {
		return gaming;
	}

	public void setGaming(Integer gaming) {
		this.gaming = gaming;
	}

	public ProductUses(String id, Integer officeAndStudy, Integer graphicDesign, Integer business, Integer development,
			Integer gaming) {
		super();
		this.id = id;
		this.officeAndStudy = officeAndStudy;
		this.graphicDesign = graphicDesign;
		this.business = business;
		this.development = development;
		this.gaming = gaming;
	}

	public ProductUses() {
		super();
		this.id = "";
		this.officeAndStudy = 0;
		this.graphicDesign = 0;
		this.business = 0;
		this.development = 0;
		this.gaming = 0;
	}
}
