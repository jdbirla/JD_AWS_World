package com.example.aws.sns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.aws.sns.service.SNSService;

@RestController
public class SNSController {

	@Autowired
	private SNSService service;

	@PostMapping(path = "/publish")
	public ResponseEntity<String> publishMail(@RequestBody List<String> payload) {

		service.pubTopic(payload.get(0), payload.get(1));
		return new ResponseEntity<>("Message published", HttpStatus.OK);
	}
}
