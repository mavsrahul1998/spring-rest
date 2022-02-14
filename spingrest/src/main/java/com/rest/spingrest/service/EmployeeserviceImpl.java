package com.rest.spingrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.rest.spingrest.controller.entity.employees;
import com.rest.spingrest.repository.EmployeeDao;

@Service
public class EmployeeserviceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;
	List<employees>list;
	
	//to get the list of employees
	@Override
	public List<employees> getemployees() {
		List<employees>emp= employeedao.findAll();
		//to show the mock data in the console
		System.out.println("getting the data db:"+ emp);
		return emp;	
	}
	// to get the single employee from the list
	
	
	 @Override public employees getemployee(Long employeeId) { 
		 //TODOAuto-generated method stub 
	 return this. employeedao.getById(employeeId);
	  }
	 
	
	//to create the employee
	@Override
	public employees addemployee(employees employee) {
		 
		 employeedao.save(employee);
		 return employee;
		
	}
	// to update the employee
	@Override
	public employees updateemployee(employees employee) {
		 
		employeedao.save(employee);
		return employee;
	}
	
	// to delete the employee from the list
	@Override
	public void deleteemployee(Long employeeId) {
		
		employeedao.deleteById(employeeId);
		
	}


}
