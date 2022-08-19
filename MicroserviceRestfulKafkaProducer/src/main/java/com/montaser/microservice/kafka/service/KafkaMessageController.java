package com.montaser.microservice.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.montaser.microservice.kafka.model.IncommingMessage;

@RestController
public class KafkaMessageController {

	@Autowired
	private KafkaProducerService kafkaProducerService;

	@PostMapping("/post")
	public String sendMessageToKafka(@RequestBody IncommingMessage message) {

		kafkaProducerService.sendMessage(message.getTopic(), message.getKey(), message.getValue());
		return String.format("Success - Message for key %s is send to Kafka Topic: %s", message.getKey(),
				message.getTopic());
	}
}
