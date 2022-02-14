package com.rest.spingrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.spingrest.controller.entity.employees;
import com.rest.spingrest.service.EmployeeService;

@RestController
public class Rahulcontroller {
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/home")
	public String hi() {
		return "Hi welcome to spring boot";
	}
	
	//get the list of employees

	@GetMapping("/employees")
	public List<employees> getemployees () {
		return this.employeeservice.getemployees();
		
	}
	//get the single employee
	@GetMapping("/employees/{employeeId}")
	public employees getemployee(@PathVariable Long employeeId) {
		
		 return this.employeeservice.getemployee(employeeId);
	}
	
	//create the list of employees
	@PostMapping("/employees")
	public employees addemployee(@RequestBody employees employee) {
		return this.employeeservice.addemployee(employee);
		
	}
	//updating employees
	@PutMapping("/employees")
	public employees updateemployee(@RequestBody employees employee) {
		return this.employeeservice.updateemployee(employee);
		
	}
	
	//deleting employees
	@DeleteMapping("/employees/{employeeId}")
	public void deleteemployee(@PathVariable Long employeeId) {
		 this.employeeservice.deleteemployee(employeeId);
		
	}
	

	}
	


