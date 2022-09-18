package com.store.startlight_store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name = "ID", columnDefinition = "varchar(30)")
	private String id;

	@Column(name = "Brand", columnDefinition = "varchar(15) not null")
	private String brand;

	@Column(name = "Model", columnDefinition = "varchar(30) not null")
	private String model;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Uses", columnDefinition = "varchar(30) not null")
	private ProductUses uses;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Size", columnDefinition = "varchar(30) not null")
	private ProductSize size;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Material", columnDefinition = "varchar(30) not null")
	private ProductMaterial material;

	@Column(name = "Color", columnDefinition = "varchar(15) not null")
	private String color;

	@Column(name = "WaterDirtResistance", columnDefinition = "varchar(15) not null")
	private String waterDirtResistance;

	@Column(name = "Fan", columnDefinition = "int not null")
	private Integer fan;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "CPU", columnDefinition = "varchar(30) not null")
	private ProductCPU cpu;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "VGA", columnDefinition = "varchar(30) null")
	private ProductGPU vga;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "GPU", columnDefinition = "varchar(30) null")
	private ProductGPU gpu;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "RAM", columnDefinition = "varchar(30) not null")
	private ProductRAM ram;

	@Column(name = "MaxSupport_RAM", columnDefinition = "decimal(5,1) not null")
	private Double maxSupportRAM;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "ROM", columnDefinition = "varchar(30) not null")
	private ProductROM rom;

	@Column(name = "MemoryCard", columnDefinition = "varchar(30) not null")
	private String memoryCard;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Screen", columnDefinition = "varchar(50) not null")
	private ProductScreen screen;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "SecondScreen", columnDefinition = "varchar(50) null")
	private ProductScreen secondScreen;

	@Column(name = "SpinScreen", columnDefinition = "boolean not null")
	private boolean spinScreen;
	
	@Column(name = "FlipScreen", columnDefinition = "boolean not null")
	private boolean flipScreen;
	
	@Column(name = "Webcam", columnDefinition = "varchar(15) not null")
	private String webcam;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<ProductCamera> frontCamera;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<ProductCameraFunction> cameraFunction;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<ProductCamera> selfieCamera;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<ProductSecurity> security;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<ProductSensor> sensor;
	
	@Column(name = "Keyboard", columnDefinition = "varchar(50) not null")
	private String keyboard;

	@Column(name = "Touchpad", columnDefinition = "varchar(30) not null")
	private String touchpad;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "OS", columnDefinition = "varchar(30) not null")
	private ProductOS os;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Pin", columnDefinition = "varchar(30) not null")
	private ProductBattery pin;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Connection", columnDefinition = "varchar(30) not null")
	private ProductConnection connection;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "Sim", columnDefinition = "varchar(30) not null")
	private ProductSim sim;

	@ManyToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "CommunicationPort", columnDefinition = "varchar(30) not null")
	private ProductCommunicationPort communicationPort;

	@Column(name = "Speaker", columnDefinition = "int not null")
	private Integer speaker;

	@Column(name = "HeadphoneJack", columnDefinition = "varchar(15) not null")
	private String headphoneJack;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public ProductUses getUses() {
		return uses;
	}

	public void setUses(ProductUses uses) {
		this.uses = uses;
	}

	public ProductSize getSize() {
		return size;
	}

	public void setSize(ProductSize size) {
		this.size = size;
	}

	public ProductMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ProductMaterial material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWaterDirtResistance() {
		return waterDirtResistance;
	}

	public void setWaterDirtResistance(String waterDirtResistance) {
		this.waterDirtResistance = waterDirtResistance;
	}

	public Integer getFan() {
		return fan;
	}

	public void setFan(Integer fan) {
		this.fan = fan;
	}

	public ProductCPU getCpu() {
		return cpu;
	}

	public void setCpu(ProductCPU cpu) {
		this.cpu = cpu;
	}

	public ProductGPU getVga() {
		return vga;
	}

	public void setVga(ProductGPU vga) {
		this.vga = vga;
	}

	public ProductGPU getGpu() {
		return gpu;
	}

	public void setGpu(ProductGPU gpu) {
		this.gpu = gpu;
	}

	public ProductRAM getRam() {
		return ram;
	}

	public void setRam(ProductRAM ram) {
		this.ram = ram;
	}

	public Double getMaxSupportRAM() {
		return maxSupportRAM;
	}

	public void setMaxSupportRAM(Double maxSupportRAM) {
		this.maxSupportRAM = maxSupportRAM;
	}

	public ProductROM getRom() {
		return rom;
	}

	public void setRom(ProductROM rom) {
		this.rom = rom;
	}

	public String getMemoryCard() {
		return memoryCard;
	}

	public void setMemoryCard(String memoryCard) {
		this.memoryCard = memoryCard;
	}

	public ProductScreen getScreen() {
		return screen;
	}

	public void setScreen(ProductScreen screen) {
		this.screen = screen;
	}

	public ProductScreen getSecondScreen() {
		return secondScreen;
	}

	public void setSecondScreen(ProductScreen secondScreen) {
		this.secondScreen = secondScreen;
	}

	public boolean isSpinScreen() {
		return spinScreen;
	}

	public void setSpinScreen(boolean spinScreen) {
		this.spinScreen = spinScreen;
	}

	public boolean isFlipScreen() {
		return flipScreen;
	}

	public void setFlipScreen(boolean flipScreen) {
		this.flipScreen = flipScreen;
	}

	public String getWebcam() {
		return webcam;
	}

	public void setWebcam(String webcam) {
		this.webcam = webcam;
	}

	public List<ProductCamera> getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(List<ProductCamera> frontCamera) {
		this.frontCamera = frontCamera;
	}

	public List<ProductCameraFunction> getCameraFunction() {
		return cameraFunction;
	}

	public void setCameraFunction(List<ProductCameraFunction> cameraFunction) {
		this.cameraFunction = cameraFunction;
	}

	public List<ProductCamera> getSelfieCamera() {
		return selfieCamera;
	}

	public void setSelfieCamera(List<ProductCamera> selfieCamera) {
		this.selfieCamera = selfieCamera;
	}

	public List<ProductSecurity> getSecurity() {
		return security;
	}

	public void setSecurity(List<ProductSecurity> security) {
		this.security = security;
	}

	public List<ProductSensor> getSensor() {
		return sensor;
	}

	public void setSensor(List<ProductSensor> sensor) {
		this.sensor = sensor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getTouchpad() {
		return touchpad;
	}

	public void setTouchpad(String touchpad) {
		this.touchpad = touchpad;
	}

	public ProductOS getOs() {
		return os;
	}

	public void setOs(ProductOS os) {
		this.os = os;
	}

	public ProductBattery getPin() {
		return pin;
	}

	public void setPin(ProductBattery pin) {
		this.pin = pin;
	}

	public ProductConnection getConnection() {
		return connection;
	}

	public void setConnection(ProductConnection connection) {
		this.connection = connection;
	}

	public ProductSim getSim() {
		return sim;
	}

	public void setSim(ProductSim sim) {
		this.sim = sim;
	}

	public ProductCommunicationPort getCommunicationPort() {
		return communicationPort;
	}

	public void setCommunicationPort(ProductCommunicationPort communicationPort) {
		this.communicationPort = communicationPort;
	}

	public Integer getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Integer speaker) {
		this.speaker = speaker;
	}

	public String getHeadphoneJack() {
		return headphoneJack;
	}

	public void setHeadphoneJack(String headphoneJack) {
		this.headphoneJack = headphoneJack;
	}

	public Product(String id, String brand, String model, ProductUses uses, ProductSize size,
			ProductMaterial material, String color, String waterDirtResistance, Integer fan, ProductCPU cpu,
			ProductGPU vga, ProductGPU gpu, ProductRAM ram, Double maxSupportRAM, ProductROM rom, String memoryCard,
			ProductScreen screen, ProductScreen secondScreen, boolean spinScreen, boolean flipScreen, String webcam,
			List<ProductCamera> frontCamera, List<ProductCameraFunction> cameraFunction,
			List<ProductCamera> selfieCamera, List<ProductSecurity> security, List<ProductSensor> sensor,
			String keyboard, String touchpad, ProductOS os, ProductBattery pin, ProductConnection connection,
			ProductSim sim, ProductCommunicationPort communicationPort, Integer speaker, String headphoneJack) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.uses = uses;
		this.size = size;
		this.material = material;
		this.color = color;
		this.waterDirtResistance = waterDirtResistance;
		this.fan = fan;
		this.cpu = cpu;
		this.vga = vga;
		this.gpu = gpu;
		this.ram = ram;
		this.maxSupportRAM = maxSupportRAM;
		this.rom = rom;
		this.memoryCard = memoryCard;
		this.screen = screen;
		this.secondScreen = secondScreen;
		this.spinScreen = spinScreen;
		this.flipScreen = flipScreen;
		this.webcam = webcam;
		this.frontCamera = frontCamera;
		this.cameraFunction = cameraFunction;
		this.selfieCamera = selfieCamera;
		this.security = security;
		this.sensor = sensor;
		this.keyboard = keyboard;
		this.touchpad = touchpad;
		this.os = os;
		this.pin = pin;
		this.connection = connection;
		this.sim = sim;
		this.communicationPort = communicationPort;
		this.speaker = speaker;
		this.headphoneJack = headphoneJack;
	}
	

	public Product() {
		super();
		this.id  = "";
		this.brand  = "";
		this.model = "";
		this.uses = new ProductUses();
		this.size = new ProductSize();
		this.material = new ProductMaterial();
		this.color = "";
		this.waterDirtResistance = "";
		this.fan = 0;
		this.cpu  = new ProductCPU();
		this.vga  = new ProductGPU();
		this.gpu  = new ProductGPU();
		this.ram  = new ProductRAM();
		this.maxSupportRAM = 0.0;
		this.rom  = new ProductROM();
		this.memoryCard  = "";
		this.screen  = new ProductScreen();
		this.secondScreen  = new ProductScreen();
		this.spinScreen  = false;
		this.flipScreen  = false;
		this.webcam = "";
		this.frontCamera  = new ArrayList<ProductCamera>();
		this.cameraFunction  = new ArrayList<ProductCameraFunction>();
		this.selfieCamera  = new ArrayList<ProductCamera>();
		this.security  = new ArrayList<ProductSecurity>();
		this.sensor  = new ArrayList<ProductSensor>();
		this.keyboard  = "";
		this.touchpad  = "";
		this.os  = new ProductOS();
		this.pin  = new ProductBattery();
		this.connection = new ProductConnection();
		this.sim = new ProductSim();
		this.communicationPort = new ProductCommunicationPort();
		this.speaker = 0;
		this.headphoneJack = "";
	}
}
