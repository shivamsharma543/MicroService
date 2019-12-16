package com.sapient.training.departmentDescription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentDescriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentDescriptionApplication.class, args);
	}

}
