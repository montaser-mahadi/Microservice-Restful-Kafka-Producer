package com.montaser.microservice.kafka.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class IncommingMessage {

	private String topic;
	private String key;
	private String value;
}
