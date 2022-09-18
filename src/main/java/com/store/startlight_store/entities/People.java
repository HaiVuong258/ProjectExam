package com.store.startlight_store.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
public abstract class People {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private String citizenID;

	@Column(name = "firstname")
	@NotBlank(message = "Thiếu First name rồi")
	private  String firstName;
	
	@Column(name="lastname")
	@NotBlank(message = "Thiếu Last name rồi")
	private String lastName;
	
	@Column(name = "bithyear" ,nullable = false)
	@NotBlank(message = "Thiếu bithyear rồi")
	private int bithYear;

	@Column(name = "phonenumber",nullable = false)
	@NotBlank(message = "Thiếu phonenumber rồi")
	private String phoneNumber;

	@NotBlank(message = "Thiếu Email rồi")
	@Email(message = "Invalid email")
	private String email;
	
	public String getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
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

	public int getBithYear() {
		return bithYear;
	}

	public void setBithYear(int bithYear) {
		this.bithYear = bithYear;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
