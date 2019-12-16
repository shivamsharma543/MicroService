package com.sapient.training.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("")
public class KafkademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkademoApplication.class, args);
	}

}
