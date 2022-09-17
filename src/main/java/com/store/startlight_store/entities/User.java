package com.store.startlight_store.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "USER_NAME", length = 128,nullable = false)
	private String userName;
	
	@Column(name = "PASSWORD", length = 256,nullable = false)
	private String password;
	
	@NotBlank(message = "Thiếu First name rồi")// not blank thể hiện thông báo tại trang, nếu để trống sẽ xuất thông báo
	private String firstName;
	
	@NotBlank(message = "Thiếu Last name rồi")
	private String lastName;
	
	@NotBlank(message = "Thiếu Email rồi")
	@Email(message = "Invalid email")
	private String email;
	
	@Column(name = "PHONE_NUMBER", length = 20)
	private String phoneNumber;
	
	@Column(name = "IS_ACTIVE", length = 1)
	private Boolean isActive = false;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Department department;
	
	
	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	private List<Permission> permissions;
	public User() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Permission> getPermission() {
		return permissions;
	}
	public void setPermission(List<Permission> permission) {
		this.permissions = permission;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
	
}
