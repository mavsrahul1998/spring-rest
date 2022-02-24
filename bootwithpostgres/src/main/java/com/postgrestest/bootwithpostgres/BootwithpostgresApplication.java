package com.postgrestest.bootwithpostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postgrestest.bootwithpostgres.dao.StudentDao;

@SpringBootApplication
public class BootwithpostgresApplication implements CommandLineRunner{
	@Autowired
	private StudentDao studentDao;
	public static void main(String[] args) {
		SpringApplication.run(BootwithpostgresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//this.studentDao.createTable();
	this.studentDao.insertData( "rahul", "LUCKNOW");
	}

}