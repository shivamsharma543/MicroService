package com.sapient.training.kafkademo.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.sapient.training.kafkademo.model.Department;

@Configuration
@ComponentScan("com.sapient.training.kafkademo.*")
public class KafkaProducerConfig {

	public ProducerFactory<String, Department> producerFactory(){
	    Map<String, Object> config = new HashMap<String, Object>();
	    config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
	    config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	    config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
	    return new DefaultKafkaProducerFactory(config);
	}
	@Bean
	public KafkaTemplate<String, Department> kafkaTemplate(){
	    return new KafkaTemplate<String, Department>(producerFactory());
	}
}
