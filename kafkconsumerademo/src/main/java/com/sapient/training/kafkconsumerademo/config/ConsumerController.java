package com.sapient.training.kafkconsumerademo.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@KafkaListener(topics="topic100",groupId="group_id")
	public void consume(String message) {
		System.out.println("Message got consume"+ message);
	}
	
	@KafkaListener(topics="topic100",groupId="group_id")
	public void consume(Department department) {
		System.out.println("Message got consume"+ department.toString());
	}
	
}
