package com.simplilearn.subscriber;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaSubscriber {

	@KafkaListener(topics = "SimplilearnTopic", groupId="id1")
	public void listen(String message) {
		System.out.println("Message received ! " + message);
	}
	
	@KafkaListener(topics = "SimplilearnTopic", groupId="id2")
	public void listen1(String message) {
		System.out.println("Message received@@@ ! " + message);
	}
}
