package com.cscdepartment.courseservice.spring_assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cscdepartment.courseservice.controller")
public class SpringAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAssignment1Application.class, args);
	}

}

