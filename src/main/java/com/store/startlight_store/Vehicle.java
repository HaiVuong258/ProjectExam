package com.store.startlight_store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // nơi để chưa các định nghĩa cho những beans
public class Vehicle {

	@Bean
	Vehicle engine()
	{
		return new Vehicle();
	}
	@Bean
	Person person()
	{
		return new Person();
	}
	@Bean
	Customer customer(Person person)
	{
		return new Customer(person);
	}
}
