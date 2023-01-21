package com.sqs.examples.sqs;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Service;

@Service
public class Consumer {

	Logger logger = LogManager.getLogger(this.getClass().getName());

	@SqsListener(value = "success-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
	public void mySuccessConsumer(String message) {
		System.out.println("Success messaged received: " + message);
		
	}
	
	@SqsListener(value = "failure-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
	public void myFailureConsumer(String message) {
		System.out.println("Failed messaged received: " + message);
		
	}
}
