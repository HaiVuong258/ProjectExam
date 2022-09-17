package com.store.startlight_store.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.store.startlight_store.Info;
import com.store.startlight_store.entities.Employee;
import com.store.startlight_store.responsitory.EmployeeRepository;

@Controller
public class WebController {

	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping("/profile")
	public String profile(Model model)
	{
		List<Info> profile = new ArrayList<>();
		profile.add(new Info("fullname","Anh"));
		profile.add(new Info("nickname", "cat"));
		profile.add(new Info("gmail", "cucanhthao050798@gmail.com"));
		profile.add(new Info("facebook", "https://www.facebook.com/david."));
		model.addAttribute("lodaProfile",profile);
		return "profile";
	}
	@GetMapping("/employees")
	public String employees(Model model)
	{
		List<Employee> employeeList = employeeRepository.findAll();
		model.addAttribute("employeeList",employeeList);
		return "employees";
	}
	
}
