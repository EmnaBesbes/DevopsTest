package com.example.demo;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
@Entity
@Repository

@SpringBootApplication
public class ProjectTestDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTestDevopsApplication.class, args);
	}

}
