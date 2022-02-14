package com.rest.spingrest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.rest.spingrest.controller.entity.employees;
import com.rest.spingrest.repository.EmployeeDao;
import com.rest.spingrest.service.EmployeeService;



@SpringBootTest
public class SpingrestApplicationTests {
	@Autowired
	private EmployeeService employeeservice;
	
	@MockBean
	private EmployeeDao employeeDao;
	
	@Test
	public void getemployees() {
		when(employeeDao.findAll()).thenReturn(Stream.
				of(new employees((long) 4568,"rahul","pers"),new employees((long) 4569,"ranjani","tcs")).collect(Collectors.toList()));
		assertEquals(2, employeeservice.getemployees().size());
	}
	@Test
	public void addemployee() {
		employees emp =new employees((long) 5569,"jeelan","info");
		when(employeeDao.save(emp)).thenReturn(emp);
		assertEquals(emp, employeeDao.save(emp));
	}
	@Test
	public void deleteemployee() {
		employees emp =new employees((long) 4568,"rahul","pers");
		employeeDao.delete(emp);
		verify(employeeDao, times(1)).delete(emp);
	}

	
  }
	
	


