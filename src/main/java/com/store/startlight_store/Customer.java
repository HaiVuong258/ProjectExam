package com.store.startlight_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component // tao 2 class(2 object) Customer va Person được quản lý bởi IOC=>
//sau khi nhưngx object customer và person dc tạo ra dc quản lý bởi IOC thì dgl beans


public class Customer {
// C1:	get,set thông qua @Autowired // tham chiếu Custormer đến bean Person
//	private Person person;
	
//	C2:(dgl dependencies injection thoong qua constructor)
	 private final Person person;
	Customer(Person person)
	{
		this.person = person;
	}
	public String getPerson()
	{
		return person.getName();
	}

}
