package com.store.startlight_store.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.startlight_store.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
