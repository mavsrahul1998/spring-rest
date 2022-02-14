package com.rest.spingrest.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.spingrest.controller.entity.employees;

@Repository
public interface EmployeeDao extends  JpaRepository<employees, Long> {

	


}
