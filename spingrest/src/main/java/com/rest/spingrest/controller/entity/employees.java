package com.rest.spingrest.controller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class employees {
@Id
	private Long id;
	private String name;
	private String company;
	public employees(Long id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
	
	public employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "employees [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
	
	
}
