package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sender.KafkaSender;

@RestController
public class KafkaController {
	
	@Autowired
	KafkaSender sender;
	
	@GetMapping("/publish")
	public String publish(@RequestParam("message") String message) {
		sender.send(message);
		return "message published successfully";
	}

}
