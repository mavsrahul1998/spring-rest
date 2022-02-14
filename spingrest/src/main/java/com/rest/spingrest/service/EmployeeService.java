package com.rest.spingrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.spingrest.controller.entity.employees;
import com.rest.spingrest.repository.EmployeeDao;


public interface EmployeeService {

	
	public List<employees> getemployees();

	public employees getemployee(Long employeeId);
	
	public employees addemployee(employees employee);

	public employees updateemployee(employees employee);
	
     public void deleteemployee(Long employeeId);
     
   
     
     

	
	
	
	
	
	

	
	

	

	

	

	

	

	
	
	
}
