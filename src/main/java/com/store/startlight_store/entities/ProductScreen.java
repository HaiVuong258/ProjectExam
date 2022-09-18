package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductScreen")
public class ProductScreen {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(50)")
	private String id;

	@Column(name = "Size", columnDefinition = "decimal(5,2) not null")
	private Double size;

	@Column(name = "Ratio", columnDefinition = "varchar(15) not null")
	private String ratio;

	@Column(name = "Resolution", columnDefinition = "varchar(15) not null")
	private String resolution;

	@Column(name = "Type", columnDefinition = "varchar(15) not null")
	private String type;

	@Column(name = "FPS", columnDefinition = "int not null")
	private Integer fps;
	
	@Column(name = "Brightness", columnDefinition = "int not null")
	private Integer brightness;
	
	@Column(name = "Panel", columnDefinition = "varchar(15) not null")
	private String panel;

	@Column(name = "ColorCoverage", columnDefinition = "varchar(15) not null")
	private String colorCoverage;

	@Column(name = "Touch", columnDefinition = "boolean not null")
	private boolean touch;
	
	@Column(name = "Material", columnDefinition = "varchar(30) not null")
	private String material;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFps() {
		return fps;
	}

	public void setFps(Integer fps) {
		this.fps = fps;
	}

	public Integer getBrightness() {
		return brightness;
	}

	public void setBrightness(Integer brightness) {
		this.brightness = brightness;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getColorCoverage() {
		return colorCoverage;
	}

	public void setColorCoverage(String colorCoverage) {
		this.colorCoverage = colorCoverage;
	}

	public boolean isTouch() {
		return touch;
	}

	public void setTouch(boolean touch) {
		this.touch = touch;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public ProductScreen(String id, Double size, String ratio, String resolution, String type, Integer fps,
			Integer brightness, String panel, String colorCoverage, boolean touch, String material) {
		super();
		this.id = id;
		this.size = size;
		this.ratio = ratio;
		this.resolution = resolution;
		this.type = type;
		this.fps = fps;
		this.brightness = brightness;
		this.panel = panel;
		this.colorCoverage = colorCoverage;
		this.touch = touch;
		this.material = material;
	}

	public ProductScreen() {
		super();
		this.id = "";
		this.size = 0.0;
		this.ratio = "";
		this.resolution = "";
		this.type = "";
		this.fps = 0;
		this.brightness = 0;
		this.panel = "";
		this.colorCoverage = "";
		this.touch = false;
		this.material = "";
	}
}
