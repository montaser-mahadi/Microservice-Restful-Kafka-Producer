package com.montaser.microservice.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafkaProducerService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	
	// this message sending data from kafka producer (KafkaTemplate) => kafka core
	public void sendMessage(String topic, String key, String value) {
		log.info(String.format("Producing Message- Key: %s, Value: %s to Topic: %s", key, value, topic));
		kafkaTemplate.send(topic, key, value);
	}
}
