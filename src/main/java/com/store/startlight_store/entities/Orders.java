package com.store.startlight_store.entities;

import java.util.Date;

import javax.persistence.Column;

public class Orders {

	private int id;
	private String status;
	private String amount;
	private String citizenID;
	private Date date;
	@Column(name = "role")
	private  String role;
	
	
}
