package com.example.aws.cloud.watch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aws.cloud.watch.service.CloudWatchService;

@RestController
public class CloudWatchController {

	@Autowired
	private CloudWatchService service;

	@PostMapping(path = "/publish/{message}")
	public ResponseEntity<String> logMessageToCloudWatch(@PathVariable("message") String message) {
		service.logMessageToCloudWatch(message);
		return new ResponseEntity<>("Message logged to cloudwatch", HttpStatus.OK);
	}
}
