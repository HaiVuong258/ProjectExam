package com.store.startlight_store;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.store.startlight_store.entities.Permission;

import com.store.startlight_store.service.UserService;

@SpringBootApplication
public class StartlightStoreApplication implements CommandLineRunner {

	@Autowired
	private Customer customer;
	
	@Autowired
	private UserService userSer;

	public static void main(String[] args) {
		SpringApplication.run(StartlightStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------Hello--------------");
		System.out.println("Customer" + customer.getPerson());
		if (userSer.getByUserName("admin") == null) {
			userSer.createDefaultAdmin();
		}
//	userSer.createDefaultAdmin();
//	Employee employee1 = new Employee();
//	employee1.setName("Nguyen Van A");
//	Employee employee1Dtl = new Employee();
//	employeeResponsitory.save(employee1);
//	List<Employee> employeeList = employeeResponsitory.findAll();
//	for(Employee employee: employeeList)
//	{
//		System.out.println("Employee Name: "+employee.getName());	
//	}

//	Department dept = new Department();
//	dept.setName("IT");
//	
//	Permission adminper = new Permission();
//	adminper.setName("ADMIN");
//	Permission managerper = new Permission();
//	managerper.setName("MANAGER");
//	
//	List<Permission> permission = new ArrayList<Permission>();
//	permission.add(adminper);
//	permission.add(managerper);
//	
//	Employee employee1 = new Employee();
//	employee1.setName("Hung");
//	employee1.setDepartment(dept);
//	employee1.setPermissions(permission);
//	employeeResponsitory.save(employee1);
////	
//	Optional<Employee> employee3Optional = employeeResponsitory.findById(17);
//	Employee employee3 = employee3Optional.get();
//	System.out.println("Employee name: "+employee3.getName());
//	employee3.setName("An");
//	//employee3.setDateOfBirth(new Date());
//	Date mydob = new SimpleDateFormat("dd/MM/yyyy").parse("10/07/1998");
//	employee3.setDateOfBirth(mydob);
//	
//	employeeResponsitory.save(employee3);
////	employeeResponsitory.deleteById(1);

	}

}
