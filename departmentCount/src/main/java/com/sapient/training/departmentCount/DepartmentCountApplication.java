package com.sapient.training.departmentCount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentCountApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentCountApplication.class, args);
	}

}
