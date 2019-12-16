package com.sapient.training.kafkademo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.training.kafkademo.model.*;

@RestController
public class KafkaProducerController {
	
	final private String topic = "topic100";

	@Autowired
	private KafkaTemplate<String,Department> kafkaTemplate;
	
	@PostMapping("publishmessage/{message}")
	public String publishMesage(@PathVariable String message) {
		
		kafkaTemplate.send(topic,new Department(1,message,"JAVA"));
		
		return "message produce successfully";
		
		
	}
}
